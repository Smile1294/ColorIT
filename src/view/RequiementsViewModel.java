package view;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Requirement;


import javafx.collections.ObservableList;


public class RequiementsViewModel {
  private StringProperty why;
  private StringProperty who;
  private StringProperty what;
  private StringProperty ID;
  private StringProperty neededTime;
  private StringProperty DeadLine;
  private StringProperty responsibleDeveloper;

  public RequiementsViewModel(Requirement requirement){

    who = new SimpleStringProperty(requirement.getWho());
    what = new SimpleStringProperty(requirement.getWhat());
    ID = new SimpleStringProperty(requirement.getID());
    neededTime = new SimpleStringProperty(requirement.getNeededTime());

  }

  public StringProperty getWho() {
    return who;
  }

  public StringProperty getID()
  {
    return ID;
  }
  public StringProperty getWhen() { return  neededTime;}
  public StringProperty getWhat()
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

  public ObservableList<ProjectViewModel> getList()
  {
    return getList();
  }

}
