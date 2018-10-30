package bg.sofia.uni.fmi.jira.issues;

import java.time.LocalDateTime;

import bg.sofia.uni.fmi.jira.Component;
import bg.sofia.uni.fmi.jira.User;
import bg.sofia.uni.fmi.jira.enums.IssuePriority;
import bg.sofia.uni.fmi.jira.enums.IssueType;
import bg.sofia.uni.fmi.jira.issues.exceptions.InvalidReporterException;

public class Task extends Issue{
    private LocalDateTime dueTime;
    
    public Task(IssuePriority priority, Component component, User reporter, String description, LocalDateTime dueTime) throws InvalidReporterException {
        super(priority, component, reporter, description);
        setDueTime(dueTime);
        super.setType(IssueType.TASK);
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
    public LocalDateTime getDueTime() {
        return dueTime;
    }
    public void setDueTime(LocalDateTime dueTime) {
        this.dueTime = dueTime;
    }
}
