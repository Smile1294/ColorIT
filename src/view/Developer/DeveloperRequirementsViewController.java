package view.Developer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ViewHandler;

public class DeveloperRequirementsViewController {
    public TableColumn RequirementListColumn;
    public TableView RequirementListTable;
    public TextField Search;

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
}
