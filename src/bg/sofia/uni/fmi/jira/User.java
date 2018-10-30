package bg.sofia.uni.fmi.jira;

import bg.sofia.uni.fmi.jira.issues.exceptions.InvalidReporterException;

public class User {

    private String userName;

    public User(String name) throws InvalidReporterException {
        try {
            if (validateUserName(name)) {
                userName = name;
            }
        } catch (InvalidReporterException ire) {
            ire.getMessage();
        }
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public String getUserName() {
        return userName;
    }

    private boolean validateUserName(String name) throws InvalidReporterException {
        if (name.matches("[A-Z0-9]+") && name != null) {
            return true;
        } else
            throw new InvalidReporterException("Invalid User Reporter");
    }
}
