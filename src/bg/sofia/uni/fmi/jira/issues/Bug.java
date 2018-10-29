package bg.sofia.uni.fmi.jira.issues;

import bg.sofia.uni.fmi.jira.Component;
import bg.sofia.uni.fmi.jira.User;
import bg.sofia.uni.fmi.jira.enums.IssuePriority;
import bg.sofia.uni.fmi.jira.issues.exceptions.EmptyDescriptionException;
import bg.sofia.uni.fmi.jira.issues.exceptions.InvalidComponentException;
import bg.sofia.uni.fmi.jira.issues.exceptions.InvalidPriorityException;
import bg.sofia.uni.fmi.jira.issues.exceptions.InvalidReporterException;

public class Bug extends Issue { //TODO only Invalid Reporter Exc.
    
    private User reporter;
    private Component component;
    private String description;
    private IssuePriority prio;

    public Bug(IssuePriority priority, Component component, User reporter, String description)
            throws InvalidReporterException {
        super(priority, component, reporter, description);
        
        try {
            validateReporter(reporter);
            setReporter(reporter);
           // validateComponent(component);
            setComponent(component);
          //  validateDescription(description);
            setDescription(description);
           if (validatePriority(priority)){
               setPrio(priority) ;
           }
        } catch (InvalidReporterException ire) {
            ire.getMessage();
        }
    }
    
    private boolean validateReporter(User reporter) throws InvalidReporterException { //TODO - what does it mean by validate user here?
        if (reporter.getClass().isInstance(User.class)) {
            return true;
        } else {
            throw new InvalidReporterException("Ivalid Reporter.");
        }
    }
    
    private boolean validateComponent(Component component) throws InvalidComponentException {
        if (component.getName() != null || component.getName() == "[A-Z\\-0-9]+"){
            return true;
        } else {
            throw new InvalidComponentException("Invalid Component.");
        } 
    }
    private boolean validateDescription(String description) throws EmptyDescriptionException {
        if (description == null) {
            throw new EmptyDescriptionException("Empty Description");
        }
        return true;
    }
    private boolean validatePriority(IssuePriority priority) {
            return (priority.equals(IssuePriority.CRITICAL) || priority.equals(IssuePriority.MAJOR) || priority.equals(IssuePriority.MINOR) || priority.equals(IssuePriority.TRIVIAL));
    }
    
    public User getReporter() {
        return reporter;
    }

    public void setReporter(User reporter) {
        this.reporter = reporter;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssuePriority getPrio() {
        return prio;
    }

    public void setPrio(IssuePriority prio) {
        this.prio = prio;
    }

}
