package bg.sofia.uni.fmi.jira;

public class Component {

    private String UnID;
    private long IDnumber = 0;
    private String name;
    private User creator;

    public Component(String name, String shortName, User creator) {
        setUnID(createUnID(shortName));
    }

    private String createUnID(String shortName) {
        IDnumber++;
        return shortName + "-" + (IDnumber);
    }

    public String getUnID() {
        return this.UnID;
    }

    public void setUnID(String unID) {
        this.UnID = unID;
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

}
