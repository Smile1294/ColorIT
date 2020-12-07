package model;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Project {
    private Start_DeadLine start_deadLine;
    private Status status;
    private String title;
    private ArrayList<TeamMembers> teamMembers;
    private ArrayList<Requirement> requirements;

    public Project(String title, ArrayList<Requirement> requirement, Start_DeadLine startDeadLine, Status status) {
        this.title = title;
        this.requirements = requirement;
        this.teamMembers = teamMembers;
        this.start_deadLine = startDeadLine;
        this.status = status;
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
    public ArrayList<TeamMembers> getTeamMembers()
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
}
