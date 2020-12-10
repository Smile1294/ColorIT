package model;

import javafx.collections.ObservableList;
import view.ProjectViewModel;

import java.util.ArrayList;

public class ProjectListModelManager implements ProjectListModel
{
  private ProjectList list;
  private TeamMembers members;
  private RequirementsList requirementsList;

  public ProjectListModelManager(){
    list = new ProjectList();
    requirementsList = new RequirementsList();
  }

  @Override public ArrayList<Requirement> getRequirementListOfProject(String title)
  {
    return list.getByTitle(title).getRequirements();
  }

  @Override public ArrayList<Task> getTasksOfRequirement(Requirement requirement) {
    return null;
  }

  @Override public ProjectList getProjects() {
    return list;
  }

  @Override public Project getProject(String title) {
    return list.getByTitle(title);
  }

  @Override public Project getProject(int index) {
    return list.get(index);
  }

  @Override public void addProject(Project project) {
    list.Add(project);
  }

  @Override public void addRequirementToProject(String title,
      Requirement requirement)
  {
    requirementsList.add(requirement);
  }

  @Override public void addRequirement(Requirement requirement) {
   requirementsList.add(requirement);
  }

  @Override public boolean isProjectOpened(int index) {
    return list.get(index).isOpened();
  }

  @Override public void setProjectOpened(int index, boolean isOpened) {
    list.get(index).setOpened(isOpened);
  }

  @Override public void addTask(Task task) {

  }
  @Override public int RequirementsListSize() {
    return requirementsList.getSize();
  }

  @Override public Requirement getRequirement(int index) {
    return requirementsList.SpeicficReq(index);
  }

  @Override public void addDeveloper(String title,Person person) {
    list.getByTitle(title);
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
    for(Developer x:members.getDevelopers()){
      if (x.equals(developer)){
        return x;
      }
    }
    return null;
  }

  @Override public void setProjectStatus(String title,Status status) {
    list.getByTitle(title).setStatus(status);
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

  @Override public int projectListSize() {
    return list.getSize();
  }

  @Override public Requirement getRequirement(int indexOfProject,
      int indexOfRequirement) {
    return list.get(indexOfProject).getRequirement(indexOfRequirement);
  }
}
