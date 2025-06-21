package petri.validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * Classe qui représente un résultat de validation, c'est-Ã -dire une liste
 * d'erreurs avec message et objet concerné.
 * @author Guillaume Dupont
 * @version 0.1
 */
public class ValidationResult {
	/**
	 * Classe interne qui représente une erreur, avec l'objet source de l'erreur
	 * et le message associé.
	 */
	public static class ValidationError {
		/** Source de l'erreur (objet visité au moment oÃ¹ l'erreur est enregistrée) */
		public final EObject object;
		/** Message d'erreur */
		public final String error;
		
		/**
		 * Construit une erreur avec son objet associé et son message.
		 * @param object objet de l'erreur au moment de l'enregistrement
		 * @param error message d'erreur
		 */
		public ValidationError(EObject object, String error) {
			this.object = object;
			this.error = error;
		}
		
		/**
		 * Transforme l'erreur en chaÃ®ne de caractÃ¨re.
		 * @return chaÃ®ne représentant l'erreur
		 */
		@Override
		public String toString() {
			return "Erreur dans " + Utils.guessName(this.object) + ": "
					+ this.error;
		}
	}
	
	/** Liste des erreurs enregistrées dans ce résultat (présumément mise Ã  jour par un validateur) */
	private List<ValidationError> recordedErrors = new ArrayList<>();
	
	/**
	 * Construit un résultat de validation.
	 */
	public ValidationResult() {}
	
	/**
	 * Enregistre une erreur, avec son objet source et son message d'erreur.
	 * @param object source de l'erreur (un objet du méta-modÃ¨le)
	 * @param error message d'erreur associé
	 */
	public void recordError(EObject object, String error) {
		this.recordedErrors.add(new ValidationError(object, error));
	}
	
	/**
	 * Enregistre une erreur si et seulement si le test est échoué (le booléen est Ã  faux).
	 * Cette méthode permet d'écrire les contraintes de maniÃ¨re un peu plus lisibles.
	 * @param test booléen qui détermine si l'erreur est Ã  enregitrer ou non
	 * @param object objet en cours de visite qui est la source de l'erreur (le cas échéant)
	 * @param error message d'erreur
	 */
	public void recordIfFailed(boolean test, EObject object, String error) {
		if (!test) {
			this.recordError(object, error);
		}
	}
	
	/**
	 * RécupÃ¨re la liste (non-modifiable) des erreurs enregistrées dans le résultat.
	 * @return liste (non-modifiable) des erreurs enregistrées
	 */
	public List<ValidationError> getRecordedErrors() {
		return Collections.unmodifiableList(this.recordedErrors);
	}
	
	/**
	 * RécupÃ¨re la liste des erreurs enregistrées dans le résultat et associées Ã  une
	 * classe donnée.
	 * @param filter classe spécifique dont on veut les erreurs
	 * @return erreurs associées Ã  la classe (potentiellement vide si pas d'erreur)
	 */
	public List<ValidationError> getRecordedErrorsFor(EClass filter) {
		return this.recordedErrors.stream().filter(v -> v.object.eClass().equals(filter)).toList();
	}
	
	/**
	 * RécupÃ¨re la liste des erreurs enregistrées dans le résultat et associées Ã  une
	 * classe donnée, sous la forme d'un identifiant de classe (généralement défini dans le 
	 * package associé au méta-modÃ¨le).
	 * @param classId identifiant de la classe spécifique dont on veut les erreurs
	 * @return erreurs associées Ã  la classe (potentiellement vide si pas d'erreur)
	 */
	public List<ValidationError> getRecordedErrorsFor(int classId) {
		return this.recordedErrors.stream().filter(v -> v.object.eClass().getClassifierID() == classId).toList();
	}
}