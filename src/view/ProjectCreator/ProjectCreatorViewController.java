package view.ProjectCreator;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ViewHandler;

public class ProjectCreatorViewController {
    public Button AssignRole;
    public Button RemoveMember;
    public Button CreateProject;
    public TableView ProjectListTable;
    public TableColumn ProjectListColumn;
    public TextField SearchProject;
    public Button AddMember;
    public Button EditProject;
    public Button DeleteProject;

    private Region root;
    private ViewHandler view;
    private ProjectListModel model;

    public void BackOnClick(ActionEvent actionEvent) {
    }

    public void CreateProjectOnClick(ActionEvent actionEvent) {
    }

    public void AssignRoleOnClick(ActionEvent actionEvent) {
    }

    public void RemoveMemberOnClick(ActionEvent actionEvent) {
    }

    public void AddMemberOnClick(ActionEvent actionEvent) {
    }

    public void EditProjectOnClick(ActionEvent actionEvent) {
    }

    public void DeleteProjectOnClick(ActionEvent actionEvent) {
    }



    public void init(Region root, ViewHandler view, ProjectListModel model){
        this.root = root;
        this.view = view;
        this.model = model;
    }
    public Region getRoot(){
        return root;
    }
}
