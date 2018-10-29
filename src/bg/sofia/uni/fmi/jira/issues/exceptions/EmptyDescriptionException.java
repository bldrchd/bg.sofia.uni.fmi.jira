package bg.sofia.uni.fmi.jira.issues.exceptions;

public class EmptyDescriptionException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public EmptyDescriptionException() {

    }

    public EmptyDescriptionException(String message) {
        super(message);
    }
}
