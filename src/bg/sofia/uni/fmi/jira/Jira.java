package bg.sofia.uni.fmi.jira;

import java.time.LocalDateTime;

import bg.sofia.uni.fmi.jira.enums.IssuePriority;
import bg.sofia.uni.fmi.jira.enums.IssueResolution;
import bg.sofia.uni.fmi.jira.enums.IssueStatus;
import bg.sofia.uni.fmi.jira.enums.IssueType;
import bg.sofia.uni.fmi.jira.interfaces.IssueTracker;
import bg.sofia.uni.fmi.jira.issues.Issue;
import bg.sofia.uni.fmi.jira.issues.exceptions.InvalidResolutionException;

public class Jira implements IssueTracker {
    
    Component component;
    IssueStatus status;
    IssuePriority prio;
    IssueType type;
    IssueResolution resolution;    
    Issue[] issues;
    
    public Jira(Issue[] issues){
        
    }

    @Override
    public Issue[] findAll(Component component, IssueStatus status) {
        for (Issue issue : issues) {
            
        }
        return null;
    }

    @Override
    public Issue[] findAll(Component component, IssuePriority priority) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Issue[] findAll(Component component, IssueType type) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Issue[] findAll(Component component, IssueResolution resolution) {
        return null;
        
    }

    @Override
    public Issue[] findAllIssuesCreatedBetween(LocalDateTime startTime, LocalDateTime endTime) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Issue[] findAllBefore(LocalDateTime dueTime) {
        // TODO Auto-generated method stub
        return null;
    }
}
