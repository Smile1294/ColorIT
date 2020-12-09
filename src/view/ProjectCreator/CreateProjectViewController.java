package view.ProjectCreator;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.*;
import view.*;
import view.RequiementsListViewModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CreateProjectViewController {
    public TableView<RequiementsViewModel> RequirementsTable;
    public Button Show;
    public Button Add;
    public Button Create;
    public TextField Title;
    public DatePicker DateForDeadline;

    @FXML private TableColumn<RequiementsViewModel,String> Who;
    @FXML private TableColumn<RequiementsViewModel,String> What;
    @FXML private TableColumn<RequiementsViewModel,String> IDS;
    @FXML private TableColumn<RequiementsViewModel,String> Why;

    private Region root;
    private ViewHandler view;
    private ProjectListModel model;
    private RequiementsListViewModel smodel;

    public CreateProjectViewController()
    {

    }
    public void init(Region root, ViewHandler view, ProjectListModel model){
        this.root = root;
        this.view = view;
        this.smodel = new RequiementsListViewModel(model);
        this.model = model;

        Who.setCellValueFactory(cellData -> cellData.getValue().getWho());
        What.setCellValueFactory(cellData -> cellData.getValue().getWhat());
        Why.setCellValueFactory(cellData -> cellData.getValue().getWhy());
        IDS.setCellValueFactory(cellData -> cellData.getValue().getID());


        RequirementsTable.setItems(smodel.getList());
    }




    public void ShowOnClick(ActionEvent actionEvent) {

    }

    public void AddOnClick(ActionEvent actionEvent) {
        view.openView("RequirementsView");
    }

    public void CreateOnClick() {

    }

    public void BackOnClick(ActionEvent actionEvent) {
        view.openView("ProjectCreatorView");
    }


    public void reset()
    {
        smodel.update();
    }

    public Region getRoot()
    {
        return root;
    }
}
