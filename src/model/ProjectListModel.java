package model;

import java.util.ArrayList;

public interface ProjectListModel
{
  ArrayList<Requirement> getRequirementListOfProject(Project project);
  ArrayList<Task> getTasksOfRequirement(Requirement requirement);
  ProjectList getProjects();
  Project getProject(String title);
  void addProject(Project project);
  void addRequirement(Requirement requirement);
  void addTask(Task task);
  void addTeamMember(Person person);
  Time showTimeSpentOnRequirement();
  Time showTimeSpentOnTask();
  void setRoleOfTeamMember(Person person,String role);
  Developer getDeveloper(Developer developer);
  void setProjectStatus(Status status);
  ArrayList<Project> getProjectsByDeveloper(Developer developer);
  Start_DeadLine getStartDate();
  Start_DeadLine getDeadLine();
}
