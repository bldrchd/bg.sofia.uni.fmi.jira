package bg.sofia.uni.fmi.jira.issues;

import bg.sofia.uni.fmi.jira.interfaces.IIssue;
import bg.sofia.uni.fmi.jira.issues.exceptions.InvalidReporterException;
import bg.sofia.uni.fmi.jira.Component;
import bg.sofia.uni.fmi.jira.User;
import bg.sofia.uni.fmi.jira.enums.IssuePriority;
import bg.sofia.uni.fmi.jira.enums.IssueResolution;
import bg.sofia.uni.fmi.jira.enums.IssueStatus;

import java.time.LocalDateTime;

public class Issue implements IIssue {
    
    public Issue(IssuePriority priority, Component component, User reporter, String description) throws InvalidReporterException {
        
    }

    @Override
    public void resolve(IssueResolution resolution) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setStatus(IssueStatus status) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LocalDateTime getLastModifiedAt() {
        // TODO Auto-generated method stub
        return null;
    }

}
