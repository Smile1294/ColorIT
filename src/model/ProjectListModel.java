package model;

import java.util.ArrayList;

public interface ProjectListModel
{
  ArrayList<Requirement> getRequirementListOfProject(String title);
  ArrayList<Task> getTasksOfRequirement(Requirement requirement);
  ProjectList getProjects();
  Project getProject(String title);
  Project getProject(int index);
  void addProject(Project project);
  void addRequirementToProject(String title,Requirement requirement);
  void addTask(Task task);
  void addDeveloper(String title,Person person);
  Time showTimeSpentOnRequirement();
  Time showTimeSpentOnTask();
  void setRoleOfTeamMember(Person person,String role);
  Developer getDeveloper(Developer developer);
  void setProjectStatus(String title,Status status);
  ArrayList<Project> getProjectsByDeveloper(Developer developer);
  Start_DeadLine getStartDate();
  Start_DeadLine getDeadLine();
  int projectListSize();


}
