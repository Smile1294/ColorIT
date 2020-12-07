package view.ScrumMaster;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ProjectListViewModel;
import view.ProjectViewModel;
import view.ViewHandler;

import java.awt.*;

public class ScrumMasterViewController {


    public TableView<ProjectViewModel> ProjectList;
    public TableColumn<ProjectViewModel, String> title;
    public TableColumn<ProjectViewModel, String> startDate;
    public TableColumn<ProjectViewModel, String> deadLine;
    public TableColumn<ProjectViewModel, String> state;

    private Region root;
    private ViewHandler viewHandler;
    private ProjectListViewModel smodel;


    public void BackOnClick()
    {
        viewHandler.openView("Welcome");
    }

    public Region getRoot() {
        return root;
    }

    public void init(Region root, ViewHandler viewHandler, ProjectListModel model) {
        this.smodel = new ProjectListViewModel(model);
        this.root = root;
        this.viewHandler = viewHandler;

        title.setCellValueFactory(cellData -> cellData.getValue().getProjectTitle());
        startDate.setCellValueFactory(cellData -> cellData.getValue().getProjectStartDate());
        deadLine.setCellValueFactory(cellData -> cellData.getValue().getProjectDeadLine());
        state.setCellValueFactory(cellData -> cellData.getValue().getProjectState());

        ProjectList.setItems(smodel.getList());
    }
    public void reset()
    {
        smodel.update();
    }
}
