package view;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Project;

public class ProjectViewModel {
  private StringProperty projectTitle;
  private StringProperty projectStartDate;
  private StringProperty projectDeadLine;
  private StringProperty projectState;

  public ProjectViewModel(Project project){
    projectTitle = new SimpleStringProperty(project.getTitle());
    projectStartDate = new SimpleStringProperty(project.getStart_deadLine().getStartDate().getDate());
    projectDeadLine = new SimpleStringProperty(project.getStart_deadLine().getDeadLine().getDate());
   // projectState = new SimpleStringProperty(project.getStatus().toString());
  }

  public StringProperty getProjectTitle() {
    return projectTitle;
  }

  public StringProperty getProjectStartDate() {
    return projectStartDate;
  }

  public StringProperty getProjectDeadLine() {
    return projectDeadLine;
  }

  public StringProperty getProjectState() {
    return projectState;
  }
}
