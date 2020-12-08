package model;

import java.util.ArrayList;

public class Requirement {

  private TeamMembers list;
  private ArrayList<Task> tasks;
  private RequirementStatus requirementStatus;
  private Time time;
  private Start_DeadLine date;
  private String ID;
  private String why;
  private String who;
  private String what;
  private Developer responsibleDeveloper;

  public Requirement(String ID, String why, String who, String what){
    this.ID = ID;
    this.why = why;
    this.who = who;
    this.what = what;
  }
  public void setResponsibleDeveloper(Developer developer){
    if(list.doesDeveloperExist(developer)){
      responsibleDeveloper = developer;
    }
  }
  public RequirementStatus getRequirementStatus() {
    return requirementStatus;
  }

  public void addTask(Task task){
    tasks.add(task);
  }
  public Task getTask(int index){
    return tasks.get(index);
  }
  public int getTaskListSize(){
    return tasks.size();
  }

  public String toString(){
    return " " + ID + " " + why + " " + who + " " + what + " " + responsibleDeveloper + " " + date + " " + time;
  }
}
