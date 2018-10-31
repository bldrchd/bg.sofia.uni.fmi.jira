package bg.sofia.uni.fmi.jira;

import java.time.LocalDateTime;

import bg.sofia.uni.fmi.jira.enums.IssuePriority;
import bg.sofia.uni.fmi.jira.enums.IssueResolution;
import bg.sofia.uni.fmi.jira.enums.IssueStatus;
import bg.sofia.uni.fmi.jira.enums.IssueType;
import bg.sofia.uni.fmi.jira.interfaces.IssueTracker;
import bg.sofia.uni.fmi.jira.issues.Issue;

public class Jira implements IssueTracker {

    private Issue[] issues;
    private Issue[] results = null;
    private int i = 0;

    public Jira(Issue[] issues) {
        this.issues = issues;
    }

    @Override
    public Issue[] findAll(Component component, IssueStatus status) {
        results = new Issue[issues.length];
        for (Issue issue : issues) {
            if (issue.getComponent().getName().equals(component.getName()) && (issue.getStatus().equals(status))) {
                results[i] = issue;
                i++;
            }
        }
        i=0;
        return results;
    }

    @Override
    public Issue[] findAll(Component component, IssuePriority priority) {
        results = new Issue[issues.length];
        for (Issue issue : issues) {
            if (issue.getComponent().getName().equals(component.getName()) && (issue.getStatus().equals(priority))) {
                results[i] = issue;
                i++;
            }
        }
        i=0;
        return results;
    }

    @Override
    public Issue[] findAll(Component component, IssueType type) {
        results = new Issue[issues.length];
        for (Issue issue : issues) {
            if (issue.getComponent().getName().equals(component.getName()) && (issue.getType().equals(type))) {
                results[i] = issue;
                i++;
            }
        }
        i=0;
        return results;
    }

    @Override
    public Issue[] findAll(Component component, IssueResolution resolution) {
        results = new Issue[issues.length];
        for (Issue issue : issues) {
            if (issue.getComponent().getName().equals(component.getName())
                    && (issue.getResolution().equals(resolution))) {
                results[i] = issue;
                i++;
            }
        }
        i=0;
        return results;
    }

    @Override
    public Issue[] findAllIssuesCreatedBetween(LocalDateTime startTime, LocalDateTime endTime) {
        results = new Issue[issues.length];
        for (Issue issue : issues) {
            if (issue.getCreatedAt().equals(startTime) && (issue.getLastModifiedAt().equals(endTime))) {
                results[i] = issue;
                i++;
            }
        }
        return results;

    }

    @Override
    public Issue[] findAllBefore(LocalDateTime dueTime) {
        results = new Issue[issues.length];
        for (Issue issue : issues) {
            if (issue.getLastModifiedAt().isAfter(dueTime)) {
                results[i] = issue;
                i++;
            }
        }
        i=0;
        return results;
    }
}
