package bg.sofia.uni.fmi.jira;

import java.time.LocalDateTime;

import bg.sofia.uni.fmi.jira.enums.IssuePriority;
import bg.sofia.uni.fmi.jira.enums.IssueResolution;
import bg.sofia.uni.fmi.jira.enums.IssueStatus;
import bg.sofia.uni.fmi.jira.enums.IssueType;
import bg.sofia.uni.fmi.jira.interfaces.IssueTracker;
import bg.sofia.uni.fmi.jira.issues.Issue;

public class Jira implements IssueTracker {

    Issue[] issues;
    Issue[] results;

    public Jira(Issue[] issues) {

    }

    @Override
    public Issue[] findAll(Component component, IssueStatus status) {
        for (int i = 0; i <= issues.length; i++) {
            int j = 0;
            if (issues[i].getComponent().equals(component) && (issues[i].getStatus().equals(status))) {
                results[j] = issues[i];
                j++;
            }
            return results;
        }
        return null;
    }

    @Override
    public Issue[] findAll(Component component, IssuePriority priority) {
        for (int i = 0; i <= issues.length; i++) {
            int j = 0;
            if (issues[i].getComponent().equals(component) && (issues[i].getStatus().equals(priority))) {
                results[j] = issues[i];
                j++;
            }
            return results;
        }

        return null;
    }

    @Override
    public Issue[] findAll(Component component, IssueType type) {
        for (int i = 0; i <= issues.length; i++) {
            int j = 0;
            if (issues[i].getComponent().equals(component) && (issues[i].getType().equals(type))) {
                results[j] = issues[i];
                j++;
            }
            return results;
        }
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
