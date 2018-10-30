package bg.sofia.uni.fmi.jira;

import bg.sofia.uni.fmi.jira.issues.exceptions.InvalidComponentException;

public class Component {

    private String UnID;
    private long IDnumber = 0;
    private String name;
    private String shortName;
    private User creator;

    public Component(String name, String shortName, User creator) {
        try {
        setUnID(createUnID(shortName));
        setName(name);
        setCreator(creator);
        } catch (InvalidComponentException ice) {
            ice.getMessage();
        }
    }

    private String createUnID(String shortName) {
        IDnumber++;
        return shortName + "-" + (IDnumber);
    }

    public String getUnID() {
        return this.UnID;
    }

    public void setUnID(String unID) throws InvalidComponentException {
        if (unID.matches("[A-Z\\-0-9]+")) {
            this.UnID = unID;
        } else {
            throw new InvalidComponentException("Invalid Component "+unID);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
