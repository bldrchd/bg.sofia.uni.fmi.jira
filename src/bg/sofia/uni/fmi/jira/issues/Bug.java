package bg.sofia.uni.fmi.jira.issues;

import java.time.LocalDateTime;

import bg.sofia.uni.fmi.jira.Component;
import bg.sofia.uni.fmi.jira.User;
import bg.sofia.uni.fmi.jira.enums.IssuePriority;
import bg.sofia.uni.fmi.jira.enums.IssueType;
import bg.sofia.uni.fmi.jira.issues.exceptions.InvalidReporterException;

public class Bug extends Issue { 
    
    public Bug(IssuePriority priority, Component component, User reporter, String description)
            throws InvalidReporterException {
        super(priority, component, reporter, description);
        super.setType(IssueType.BUG);
    }
    public IssuePriority getPrio() {
        return super.getPrio();
    }
    public Component getComponent() {
        return super.getComponent();
    }
    public User getUser() {
        return super.getUserReporter();
    }
    public String getDescription() {
        return super.getDescription();
    }
    public User getReporter() {
        return super.getUserReporter();
    }
    public LocalDateTime getCreatedAt() {
        return super.getCreatedAt();
    }
    @Override
    public LocalDateTime getLastModifiedAt() {
        return super.getLastModifiedAt();
    }
}
