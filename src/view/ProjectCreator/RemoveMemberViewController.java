package view.ProjectCreator;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ViewHandler;

public class RemoveMemberViewController {
    public TableView MemberListTable;
    public TableColumn MemberListColumn;
    public Button Remove;

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
    }

    public void RemoveOnClick(ActionEvent actionEvent) {
    }
}
