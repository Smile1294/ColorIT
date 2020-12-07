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

    public void init(Region root, ViewHandler view, ProjectListModel model){
        this.root = root;
        this.view = view;
        this.model = model;
    }
    public Region getRoot(){
        return root;
    }


    public void BackOnClick(ActionEvent actionEvent) {
        view.openView("Welcome");
    }

    public void CreateProjectOnClick(ActionEvent actionEvent) {
        view.openView("CreateProjectView");
    }

    public void AssignRoleOnClick(ActionEvent actionEvent) {
        view.openView("AssignRoleView");
    }

    public void RemoveMemberOnClick(ActionEvent actionEvent) {
        view.openView("RemoveMemberView");
    }

    public void AddMemberOnClick(ActionEvent actionEvent) {
        view.openView("AddMemberView");
    }

    public void EditProjectOnClick(ActionEvent actionEvent) {
        view.openView("");
    }

    public void DeleteProjectOnClick(ActionEvent actionEvent) {
        view.openView("Welcome");
    }



}
