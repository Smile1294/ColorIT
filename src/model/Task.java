package model;

public class Task {
  private TeamMembers list;
  private Time time;
  private Start_DeadLine date;

  private String Title;
  private String TaskID;
  private Developer responsibleDeveloper;

  public Task(String TaskID, String Title, int timeEstimatedInHours){
    this.TaskID = TaskID;
    this.Title = Title;
    time = new Time(timeEstimatedInHours);
  }
  public void setResponsibleDeveloper(Developer developer){
    if(list.doesDeveloperExist(developer)){
      responsibleDeveloper = developer;
    }
  }
  public Developer getResponsibleDeveloper(){
    return responsibleDeveloper;
  }
  public double getTimeEstimated(){
    return time.getHoursEstimated();
  }
  public double getTimeSpent(){
    return time.getHoursSpent();
  }

  public String getTaskID() {
    return TaskID;
  }

  public String getTitle() {
    return Title;
  }
  public void setTimeSpent(double hours){
    time.setHoursSpent(hours);
  }
}
