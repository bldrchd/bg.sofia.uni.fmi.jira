package bg.sofia.uni.fmi.jira.issues.exceptions;

public class InvalidResolutionException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    public InvalidResolutionException(){
        
    }
    public InvalidResolutionException(String msg){
        super(msg);
    }
}
