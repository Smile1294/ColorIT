package view;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javafx.beans.value.ObservableValue;
import model.Requirement;

public class RequiementsViewModel {
  private StringProperty why;
  private StringProperty who;
  private StringProperty what;
  private StringProperty ID;
  private StringProperty neededTime;
  private StringProperty DeadLine;
  private StringProperty responsibleDeveloper;

  public RequiementsViewModel(Requirement requirement){
    why = new SimpleStringProperty(requirement.getWhy());
    who = new SimpleStringProperty(requirement.getWho());
    what = new SimpleStringProperty(requirement.getWhat());
    ID = new SimpleStringProperty(requirement.getID());
    neededTime = new SimpleStringProperty(requirement.getNeededTime());
    DeadLine = new SimpleStringProperty(requirement.getDeadLine());
    responsibleDeveloper = new SimpleStringProperty(requirement.getResponsibleDeveloperString());
  }

  public StringProperty getWho() {
    return who;
  }

  public StringProperty IDProperty()
  {
    return ID;
  }

  public StringProperty whatProperty()
  {
    return what;
  }
  public StringProperty getWhy()
  {
    return why;
  }

  public StringProperty neededTimeProperty()
  {
    return neededTime;
  }
  public StringProperty responsibleDeveloperProperty()
  {
    return responsibleDeveloper;
  }

}
