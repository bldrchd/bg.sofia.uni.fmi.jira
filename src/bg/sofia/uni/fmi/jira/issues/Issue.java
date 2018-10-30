package bg.sofia.uni.fmi.jira.issues;

import bg.sofia.uni.fmi.jira.interfaces.IIssue;
import bg.sofia.uni.fmi.jira.issues.exceptions.InvalidReporterException;
import bg.sofia.uni.fmi.jira.Component;
import bg.sofia.uni.fmi.jira.User;
import bg.sofia.uni.fmi.jira.enums.IssuePriority;
import bg.sofia.uni.fmi.jira.enums.IssueResolution;
import bg.sofia.uni.fmi.jira.enums.IssueStatus;
import bg.sofia.uni.fmi.jira.enums.IssueType;

import java.time.LocalDateTime;

public class Issue implements IIssue {

    private IssuePriority prio = null;
    private IssueResolution resolution = IssueResolution.UNRESOLVED;
    private IssueStatus status = IssueStatus.OPEN;
    private String description = null;
    private Component comp = null;
    private User userReporter = null;
    private LocalDateTime createdAt = null;
    private LocalDateTime lastModification = null;
    private IssueType type = null;

    public Issue(IssuePriority priority, Component component, User reporter, String description)
            throws InvalidReporterException {
        setPrio(priority);
        setComponent(component);
        setUserReporter(reporter);
        if ( validateDescription(description)) {
            setDescription(description);
        }
        resolve(resolution);
        setStatus(status); 
        setCreatedAt();
        setLastModification(createdAt);
    }


    public void setPrio(IssuePriority priority) {
        this.prio = priority;
    }

    public IssuePriority getPrio() {
        return prio;
    }

    public void setComponent(Component component) {
        this.comp = component;
    }

    public Component getComponent() {
        return comp;
    }

    private void setUserReporter(User reporter) {
        this.userReporter = reporter;
    }

    public User getUserReporter() {
        return this.userReporter;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    private boolean validateDescription(String description){
        return (description != null);
    }

    @Override
    public void resolve(IssueResolution resolution) {
        if (resolution.equals(IssueResolution.values())) {
            this.resolution = resolution;
        }
    }
    public IssueResolution getResolution(){
        return this.resolution;
    }
    public IssueStatus getStatus() {
        return this.status;
    }
    @Override
    public void setStatus(IssueStatus status) {
        if (status.equals(IssueStatus.values())) {
            this.status = status;
        }
    }

    @Override
    public String getId() {
        return comp.getUnID();
    }

    private void setCreatedAt() {
        createdAt = LocalDateTime.now();
    }
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public LocalDateTime getLastModifiedAt() {
        return lastModification;
    }

    public void setLastModification(LocalDateTime lastModification) {
        this.lastModification = lastModification;
    }
    
    public IssueType getType(){
        return this.type;
    }
    public void setType(IssueType type) {
        this.type = type;
    }
}
