package bg.sofia.uni.fmi.jira;

import bg.sofia.uni.fmi.jira.issues.exceptions.InvalidComponentException;

public class Component {

    private String UnID = null;
    private long IDnumber = 0;
    private String name = null;
    private String shortName = null;
    private User creator = null;

    public Component(String name, String shortName, User creator) {
      //  try {
        setName(name);
        setShortName(shortName);
        setCreator(creator);
        this.UnID = createUnID(shortName);
/*        } catch (InvalidComponentException ice) {
            ice.getMessage();
        }*/
    }

    private String createUnID(String shortName) {
        IDnumber++;
        return shortName + "-" + (IDnumber);
    }

    public String getUnID() {
        return this.UnID;
    }

/*    public String setUnID(String unID) throws InvalidComponentException {
        if (unID.matches("[A-Z\\-0-9]+")) {
            return this.UnID = unID;
        } else {
            throw new InvalidComponentException("Invalid Component "+unID);
        }
    }*/

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
