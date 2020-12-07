package model;

import java.util.ArrayList;
import java.util.MissingFormatArgumentException;

public class ProjectList {
    private ArrayList<Project> projects;

    public ProjectList() {
        projects = new ArrayList<>();
    }

    public void Add(Project project) {
        projects.add(project);
    }

    public Project get(int index) {
        return projects.get(index);
    }

    public void size() {
        projects.size();
    }

    public Project GetByTitle(String title) {
        for (Project project : projects) {
            if (project.getTitle().equals(title)) {
                return project;
            }
        }
        return null;
    }

    public Project getByProjectOwner(ProjectOwner owner) {
        for (int i = 0; i < projects.size(); i++) {
            if (projects.get(i).getTeamMembers().get(i).getOwner() == owner) {
                return projects.get(i);
            }
        }
        return null;
    }

    public Project getByScrumMaster(ScrumMaster scrumMaster) {
        for (int i = 0; i < projects.size(); i++) {
            if (projects.get(i).getTeamMembers().get(i).getScrum() == scrumMaster) {
                return projects.get(i);
            }
        }
        return null;
    }

    public Project getByDeveloper(Developer developer) {
        for (int i = 0; i < projects.size(); i++) {
            if (projects.get(i).getTeamMembers().get(i).getDeveloper(i) == developer) {
                projects.get(i);
            }
        }
        return null;
    }

    public Project getByRequirement(Requirement requirement) {
        return null;
    }

    public Project getByDates(MyDate date)
    {
        for (int i =0; i< projects.size(); i++)
        {
            if (projects.get(i).getStart_deadLine().getDeadLine() == date)
            {
                return projects.get(i);
            }
        }
        return null;
    }

    public Project getByStatus(Status status)
    {
        for (int i = 0; i < projects.size(); i++)
        {
            if (projects.get(i).getStatus() == status)
            {
                return projects.get(i);
            }
        }
        return null;
    }


}
