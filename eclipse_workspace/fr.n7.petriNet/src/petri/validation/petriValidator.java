package petri.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import petri.util.PetriSwitch;
import petri.petriNet;
import petri.petriElement;
import petri.PetriPackage;
import petri.arcsPonderes;
import petri.place;
import petri.transition;
import petri.intervalle;



/**
 * Réalise la validation d'un EObject issu de SimplePDL (en théorie, d'un process).
 * Cet classe visite le modÃ¨le et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement (cf. caseProcess typiquement).
 * 
 * La classe Switch exige un paramÃ¨tre de généricité (et gÃ¨re une partie de la visite Ã 
 * base de comparaison Ã  null). Ici le paramÃ¨tre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Guillaume Dupont
 * @version 0.1
 */
public class petriValidator extends PetriSwitch<Boolean> {
	/**
	 * Expression réguliÃ¨re qui correspond Ã  un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé Ã  chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public petriValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource Ã  valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}

	
	@Override
	public Boolean casepetriNet(petriNet object) {
		// Contraintes sur PetriNet
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom du réseau de Pétri ne respecte pas les conventions Java");
		
		// Visite
		for (petriElement pe : object.getPetrielements()) {
			this.doSwitch(pe);
		}
		
		return null;
	}
	
	@Override
	public Boolean caseplace(place object) {
		// Contraintes sur les places
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom de la place :  ne respecte pas les conventions Java");
		
		this.result.recordIfFailed(
				object.getPetriNet().getPetrielements().stream()
					.filter(p -> p.eClass().getClassifierID() == PetriPackage.PLACE)
					.allMatch(pe -> (pe.equals(object) || !((place) pe).getNom().contains(object.getNom()))),
				object, 
				"Le nom de la place (" + object.getNom() + ") n'est pas unique");
		
		this.result.recordIfFailed(
				object.getJetons() >=0, 
				object, 
				"La place (" + object.getNom() + ") a un nombre de jetons négatif.");
		
		int totalJetons = object.getPetriNet().getPetrielements().stream()
		        .filter(p -> p instanceof place)
		        .mapToInt(p -> ((place) p).getJetons())
		        .sum();

	    this.result.recordIfFailed(
	        totalJetons > 0,
	        object,
	        "Le réseau de Petri ne contient aucun jeton : au moins une place doit avoir un jeton.");

		return null;
	}
	
	@Override
	public Boolean casetransition(transition object) {
		// Contraintes sur les transitions
		this.result.recordIfFailed(
				object.getNom() != null && object.getNom().matches(IDENT_REGEX), 
				object, 
				"Le nom de la transition :  ne respecte pas les conventions Java");
		
		this.result.recordIfFailed(
				object.getPetriNet().getPetrielements().stream()
					.filter(p -> p.eClass().getClassifierID() == PetriPackage.TRANSITION)
					.allMatch(pe -> (pe.equals(object) || !((transition) pe).getNom().contains(object.getNom()))),
				object, 
				"Le nom de la transition (" + object.getNom() + ") n'est pas unique");
		if (object.getIntervalle() != null) {
			this.doSwitch(object.getIntervalle());
		}
		
		return null;
	}
	
	@Override
	public Boolean casearcsPonderes(arcsPonderes object) {
		// Contraintes sur les arcs		
		this.result.recordIfFailed(
				object.getPoids() >=0, 
				object, 
				"Un arc a un poids négatif.");
		
		return null;
	}
	
	
	@Override
	public Boolean caseintervalle(intervalle object) {
		// Contraintes sur intervalle
		if (object.getBsup() != null) {
			this.result.recordIfFailed(
				object.getBinf() <= object.getBsup(),
				object,
				"La transition a un intervalle avec une borne inférieure supérieure à la borne supérieure"
			);
		}
		return null;
	}
	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas Ã  un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert Ã  rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute faÃ§on ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}