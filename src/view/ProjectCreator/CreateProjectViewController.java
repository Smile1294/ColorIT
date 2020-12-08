package view.ProjectCreator;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.*;
import view.*;

import java.util.ArrayList;
import java.util.Calendar;

public class CreateProjectViewController {
    public TableView<ProjectViewModel> RequirementsTable;
    public Button Show;
    public Button Add;
    public DatePicker DateForDeadline;
    public Button Create;
    public TextField Title;
    public ChoiceBox PickerStatus = new ChoiceBox(FXCollections.observableArrayList(
        "Started","Retarded","yes"
    ));
    public TableColumn<RequiementsViewModel,String> Who;
    public TableColumn<RequiementsViewModel,String> What;
    public TableColumn<RequiementsViewModel,String> ID;
    public TableColumn<RequiementsViewModel,String> When;

    private Region root;
    private ViewHandler view;
    private RequiementsViewModel smodel;

    public void init(Region root, ViewHandler view, ProjectListModel model){
        this.root = root;
        this.view = view;
        this.smodel = new RequiementsViewModel(model.getRequirement());

        Who.setCellValueFactory(cellData -> cellData.getValue().getWho());
        What.setCellValueFactory(cellData -> cellData.getValue().whatProperty());
        ID.setCellValueFactory(cellData -> cellData.getValue().IDProperty());
        When.setCellValueFactory(cellData -> cellData.getValue().neededTimeProperty());

        RequirementsTable.setItems(smodel.getList());
    }






    public void ShowOnClick(ActionEvent actionEvent) {
    }

    public void AddOnClick(ActionEvent actionEvent) {
        view.openView("RequirementsView");
    }

    public void CreateOnClick() {
        MyDate DeadLine = new MyDate(DateForDeadline.getValue().getDayOfMonth(),DateForDeadline.getValue()
            .getMonthValue(),DateForDeadline.getValue().getYear());
        MyDate StartDate = new MyDate(Calendar.DAY_OF_MONTH,Calendar.MONTH,Calendar.YEAR);
        Start_DeadLine start_deadLine = new Start_DeadLine(StartDate,DeadLine);

    }

    public void BackOnClick(ActionEvent actionEvent) {
        view.openView("ProjectCreatorView");
    }

    public void reset()
    {
        smodel.update();
    }

    public Region getRoot(){
        return root;
    }
}
