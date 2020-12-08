package view.ProjectCreator;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.*;
import view.*;
import view.RequiementsListViewModel;

import java.util.ArrayList;
import java.util.Calendar;

public class CreateProjectViewController {
    public TableView<RequiementsViewModel> RequirementsTable;
    public Button Show;
    public Button Add;
    public DatePicker DateForDeadline;
    public Button Create;
    public TextField Title;

    @FXML private TableColumn<RequiementsViewModel,String> Who;
    @FXML private TableColumn<RequiementsViewModel,String> What;
    @FXML private TableColumn<RequiementsViewModel,String> ID;
    @FXML private TableColumn<RequiementsViewModel,String> When;

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
        ID.setCellValueFactory(cellData -> cellData.getValue().getID());
        When.setCellValueFactory(cellData -> cellData.getValue().neededTimeProperty());

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
