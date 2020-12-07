package model;

import java.util.ArrayList;

public class ProjectList {
  private ArrayList<Project> projects;

  public ProjectList(){
    this.projects = new ArrayList<>();
  }
  public void addProject(Project project){
    this.projects.add(project);
  }
  public void removeProject(Project project){
    this.projects.remove(project);
  }
  public int size(){
    return this.projects.size();
  }
}
