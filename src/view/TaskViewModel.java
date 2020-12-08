package view;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Task;

public class TaskViewModel {
  private StringProperty taskID;
  private StringProperty taskTitle;
  private DoubleProperty taskTimeSpent;
  private DoubleProperty taskTimeEstimated;

  public TaskViewModel(Task task){
    taskID = new SimpleStringProperty(task.getTaskID());
    taskTitle = new SimpleStringProperty(task.getTitle());
    taskTimeSpent = new SimpleDoubleProperty(task.getTimeSpent());
    taskTimeEstimated = new SimpleDoubleProperty(task.getTimeEstimated());
  }

  public StringProperty getTaskID() {
    return taskID;
  }

  public StringProperty getTaskTitle() {
    return taskTitle;
  }

  public DoubleProperty getTaskTimeEstimated() {
    return taskTimeEstimated;
  }

  public DoubleProperty getTaskTimeSpent() {
    return taskTimeSpent;
  }
}
