package view.ProjectCreator;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.*;
import view.ViewHandler;

import java.util.ArrayList;
import java.util.Calendar;

public class CreateProjectViewController {
    public TableView RequirementsTable;
    public TableColumn RequrimentsColumn;
    public Button Show;
    public Button Add;
    public DatePicker DateForDeadline;
    public Button Create;
    public TextField Title;
    public ChoiceBox PickerStatus = new ChoiceBox(FXCollections.observableArrayList(
        "Started","Retarded","yes"
    ));


    private Region root;
    private ViewHandler view;
    private ProjectListModel model;
    String value = (String) PickerStatus.getValue();
    private Status status;




    public void init(Region root, ViewHandler view, ProjectListModel model){
        this.root = root;
        this.view = view;
        this.model = model;
    }
    public Region getRoot(){
        return root;
    }
    MyDate DeadLine = new MyDate(DateForDeadline.getValue().getDayOfMonth(),DateForDeadline.getValue()
        .getMonthValue(),DateForDeadline.getValue().getYear());
    MyDate StartDate = new MyDate(Calendar.DAY_OF_MONTH,Calendar.MONTH,Calendar.YEAR);
    Start_DeadLine start_deadLine = new Start_DeadLine(StartDate,DeadLine);
    public void ShowOnClick(ActionEvent actionEvent) {
    }

    public void AddOnClick(ActionEvent actionEvent) {
        model.addProject(new Project(Title.getText(),
            (ArrayList<Requirement>) RequrimentsColumn.getCellFactory(),start_deadLine,status
            ));

    }

    public void CreateOnClick(ActionEvent actionEvent) {
    }

    public void BackOnClick(ActionEvent actionEvent) {
        view.openView("ProjectCreatorView");
    }
}
