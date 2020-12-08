package view;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Task;

public class TaskViewModel {
  private StringProperty taskID;
  private StringProperty taskTitle;
  private StringProperty member;
  private StringProperty taskTimeSpent;
  private StringProperty taskTimeEstimated;

  public TaskViewModel(Task task){
    taskID = new SimpleStringProperty(task.getTaskID());
    taskTitle = new SimpleStringProperty(task.getTitle());
    taskTimeSpent = new SimpleStringProperty(task.getTimeSpent());
    taskTimeEstimated = new SimpleStringProperty(task.getTimeEstimated());
    taskTitle = new SimpleStringProperty(task.getResponsibleDeveloper().getName());
  }

  public StringProperty getTaskID() {
    return taskID;
  }

  public StringProperty getTaskTitle() {
    return taskTitle;
  }

  public StringProperty getTaskTimeEstimated() {
    return taskTimeEstimated;
  }

  public StringProperty getTaskTimeSpent() {
    return taskTimeSpent;
  }

  public StringProperty getMember() {
    return member;
  }
}
