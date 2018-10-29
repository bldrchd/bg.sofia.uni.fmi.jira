package bg.sofia.uni.fmi.jira;

public class User {

    private String userName;
    
    public User(String name){
        userName = name;
    }
    
    public void setUserName(String name) {
        this.userName = name;
    }
    public String getUserName() {
        return userName;
    }
 
}
