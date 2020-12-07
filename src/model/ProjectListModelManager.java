package model;

import java.util.ArrayList;

public class ProjectListModelManager implements ProjectListModel {
  @Override public ArrayList<Requirement> getRequirementListOfProject(
      Project project) {
    return null;
  }

  @Override public ArrayList<Task> getTasksOfRequirement(
      Requirement requirement) {
    return null;
  }

  @Override public ProjectList getProjects() {
    return null;
  }

  @Override public Project getProject(String title) {
    return null;
  }

  @Override public void addProject(Project project) {

  }

  @Override public void addRequirement(Requirement requirement) {

  }

  @Override public void addTask(Task task) {

  }

  @Override public void addTeamMember(Person person) {

  }

  @Override public Time showTimeSpentOnRequirement() {
    return null;
  }

  @Override public Time showTimeSpentOnTask() {
    return null;
  }

  @Override public void setRoleOfTeamMember(Person person, String role) {

  }

  @Override public Developer getDeveloper(Developer developer) {
    return null;
  }

  @Override public void setProjectStatus(Status status) {

  }

  @Override public ArrayList<Project> getProjectsByDeveloper(
      Developer developer) {
    return null;
  }

  @Override public Start_DeadLine getStartDate() {
    return null;
  }

  @Override public Start_DeadLine getDeadLine() {
    return null;
  }
}
