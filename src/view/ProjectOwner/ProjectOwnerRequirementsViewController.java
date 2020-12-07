package view.ProjectOwner;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ViewHandler;

public class ProjectOwnerRequirementsViewController {
    public TableView RequirementTable;
    public TableColumn RequiremetsColumn;
    public TextField Search;
    public RadioButton LowPriority;
    public RadioButton HighPriority;
    public Button AddRequirement;
    public Button DeleteRequirement;
    public Button Disapprove;
    public Button Approve;

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

    public void LowPriorityOnClick(ActionEvent actionEvent) {
    }

    public void HighPriorityOnClick(ActionEvent actionEvent) {
    }

    public void AddRequirementOnClick(ActionEvent actionEvent) {
    }

    public void DeleteRequirementOnClick(ActionEvent actionEvent) {
    }

    public void DisapproveOnClick(ActionEvent actionEvent) {
    }

    public void ApproveOnClick(ActionEvent actionEvent) {
    }

    public void BackOnClick(ActionEvent actionEvent) {
    }
}
