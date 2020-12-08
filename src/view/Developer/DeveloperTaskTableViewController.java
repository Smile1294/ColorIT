package view.Developer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.TaskListViewModel;
import view.TaskViewModel;
import view.ViewHandler;

public class DeveloperTaskTableViewController {
    public TableView<TaskViewModel> TaskTable;
    public TableColumn<TaskViewModel, String> TaskColumn;
    public TableColumn<TaskViewModel, String>  MembersColumn;
    public TableColumn<TaskViewModel, String>  HoursWorkedTable;

    private Region root;
    private ViewHandler view;
    private ProjectListModel model;
    private TaskListViewModel smodel;

    public void init(Region root, ViewHandler view, ProjectListModel model){
        this.root = root;
        this.view = view;
        this.model = model;
        this.smodel = new TaskListViewModel(model);

        TaskColumn.setCellValueFactory(cellData -> cellData.getValue().getTaskTitle());
        MembersColumn.setCellValueFactory(cellData -> cellData.getValue().getMember());
        HoursWorkedTable.setCellValueFactory(cellData -> cellData.getValue().getTaskTimeSpent());

    }
    public Region getRoot(){
        return root;
    }

    public void reset()
    {
        smodel.update();
    }

    public void BackOnClick(ActionEvent actionEvent) {
    }
}
