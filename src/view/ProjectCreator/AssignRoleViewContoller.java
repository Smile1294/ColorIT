package view.ProjectCreator;

import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ViewHandler;

public class AssignRoleViewContoller {
    public TableView TeamMemberTable;
    public TableColumn TeamMemberColumn;
    public RadioButton Developer;
    public RadioButton ProjectOwner;
    public RadioButton ScrumMaster;


    private Region root;
    private ViewHandler view;
    private ProjectListModel model;

    public void init(Region root, ViewHandler view, ProjectListModel model){
        this.root = root;
        this.view = view;
        this.model = model;
    }
    public Region getRoot(){
        return root;
    }

    public void DeveloperOnClick(ActionEvent actionEvent) {
    }

    public void ProjectOwnerOnClick(ActionEvent actionEvent) {
    }

    public void ScrumMasterOnClick(ActionEvent actionEvent) {
    }

    public void BackOnClick(ActionEvent actionEvent) {
    }
}
