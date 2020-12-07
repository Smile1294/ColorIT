package view.Developer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import model.ProjectListModelManager;
import view.ProjectListViewModel;
import view.ProjectViewModel;
import view.ViewHandler;

public class DeveloperViewController {

    public TableView<ProjectViewModel> ProjectList;
    public TableColumn<ProjectViewModel, String> title;
    public TableColumn<ProjectViewModel, String> startDate;
    public TableColumn<ProjectViewModel, String> deadLine;
    public TableColumn<ProjectViewModel, String> state;

    private Region root;
    private ViewHandler view;
    private ProjectListViewModel smodel;

    public void init(Region root, ViewHandler view, ProjectListModel model){
        this.root = root;
        this.view = view;
        this.smodel = new ProjectListViewModel(model);

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

    public Region getRoot(){
        return root;
    }

    public void BackOnClick() {
        view.openView("Welcome");
    }
}
