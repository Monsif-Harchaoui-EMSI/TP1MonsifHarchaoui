package ma.emsi.tp1.tp1.CustomException;



/**
 * Exception personnalisée pour gérer les erreurs lors des requêtes vers l'API de Gemini.
 */
public class RequeteException extends Exception {

    private final String requeteJson; // Stocke la requête JSON en cas d'erreur

    /**
     * Constructeur de l'exception avec un message d'erreur et la requête JSON.
     *
     * @param message     le message décrivant l'erreur.
     * @param requeteJson la requête JSON qui a provoqué l'erreur.
     */
    public RequeteException(String message, String requeteJson) {
        super(message);
        this.requeteJson = requeteJson;
    }

    /**
     * Obtient la requête JSON associée à cette exception.
     *
     * @return la requête JSON.
     */
    public String getRequeteJson() {
        return requeteJson;
    }

    /**
     * Retourne une représentation textuelle de l'exception, incluant le message et la requête JSON.
     *
     * @return une chaîne de caractères représentant l'exception.
     */
    @Override
    public String toString() {
        return super.toString() + "\nRequête JSON :\n" + requeteJson;
    }
}
