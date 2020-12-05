package model;

public class Requirement {
  private TeamMembers list;
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

}
