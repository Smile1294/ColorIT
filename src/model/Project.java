package model;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Project {
    private Start_DeadLine start_deadLine;
    private Status status;
    private String title;
    private TeamMembers teamMembers;
    private boolean isOpened;
    private ArrayList<Requirement> requirements;

    public Project(String title, Start_DeadLine startDeadLine) {
        this.title = title;
        this.requirements = new ArrayList<>();
        this.teamMembers = teamMembers;
        this.start_deadLine = startDeadLine;
        //this.status = status;
        this.isOpened = false;
    }

    public void addRequriement(Requirement requirement) {
        requirements.add(requirement);
    }

    public Start_DeadLine getStart_deadLine() {
        return start_deadLine;
    }

    public Status getStatus() {
        return status;
    }
    public TeamMembers getTeamMembers()
    {
        return teamMembers;
    }
    public String getTitle(){return title;}

    public void setStatus(Status status) {
        this.status = status;
    }

    public void Edit(String title, Requirement requirement, Start_DeadLine startDeadLine, Status status) {
        this.title = title;
        this.addRequriement(requirement);
        this.start_deadLine = startDeadLine;
        this.status = status;
    }

    public Requirement getRequirement(String title)
    {
         return null;
    }

    public ArrayList<Requirement> getRequirements(){
        return requirements;
    }

    public Requirement getRequirement(int index)
    {
        return requirements.get(index);
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public String toString() {
        return " "+title+" " + start_deadLine + " " + status +  " " + teamMembers + " " + requirements;
    }
}
