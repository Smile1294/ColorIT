package view.Developer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.RequiementsListViewModel;
import view.RequiementsViewModel;
import view.TaskListViewModel;
import view.ViewHandler;

public class DeveloperRequirementsViewController {
    public TableView<RequiementsViewModel> RequirementListTable;
    public TextField Search;
    public TableColumn<RequiementsViewModel,String> IDS;
    public TableColumn<RequiementsViewModel,String> Who;
    public TableColumn<RequiementsViewModel,String> What;
    public TableColumn<RequiementsViewModel,String> Why;

    private Region root;
    private ViewHandler view;
    private ProjectListModel model;
    private RequiementsListViewModel smodel;

    public void init(Region root, ViewHandler view, ProjectListModel model){
        this.root = root;
        this.view = view;
        this.model = model;
        this.smodel = new RequiementsListViewModel(model);

        Who.setCellValueFactory(cellData -> cellData.getValue().getWho());
        What.setCellValueFactory(cellData -> cellData.getValue().getWhat());
        Why.setCellValueFactory(cellData -> cellData.getValue().getWhy());
        IDS.setCellValueFactory(cellData -> cellData.getValue().getID());

        RequirementListTable.setItems(smodel.getList());
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
