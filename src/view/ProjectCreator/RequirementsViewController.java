package view.ProjectCreator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import model.*;
import view.ViewHandler;

import java.awt.*;
import java.util.Calendar;

public class RequirementsViewController
{
  public DatePicker Deadline;
  public Button Apply;
  public TextField ID;
  public TextField Who;
  public TextField What;
  public TextField Whz;
  public TextField hours;
  public HBox deadline;
  public DatePicker DateForDeadline;
  public Time time;

  private Region root;
  private ViewHandler view;
  private ProjectListModel model;

  public RequirementsViewController()
  {

  }

  public void init(Region root, ViewHandler view, ProjectListModel model)
  {
    this.root = root;
    this.view = view;
    this.model = model;
     reset();
  }

  public void reset()
  {
    this.ID.setText("");
    this.What.setText("");
    this.Who.setText("");
    this.Whz.setText("");
  }

  public Region getRoot()
  {
    return root;
  }

  public void DeadlineOnClck(ActionEvent actionEvent)
  {
  }

  @FXML private void ApplyOnClick()
  {

    Requirement requirement = new Requirement(ID.getText(), What.getText(),
        Who.getText(), Whz.getText());
    model.addRequirement(requirement);
    reset();
    view.openView("CreateProjectView");
  }

  public void BackOnClick(ActionEvent actionEvent)
  {
    view.openView("CreateProjectView");
    reset();
  }
}
