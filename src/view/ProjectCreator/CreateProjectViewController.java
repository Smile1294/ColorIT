package view.ProjectCreator;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ViewHandler;

public class CreateProjectViewController {
    public TableView RequirementsTable;
    public TableColumn RequrimentsColumn;
    public Button Show;
    public Button Add;
    public DatePicker DateForDeadline;
    public Button Create;

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

    public void ShowOnClick(ActionEvent actionEvent) {
    }

    public void AddOnClick(ActionEvent actionEvent) {
    }

    public void CreateOnClick(ActionEvent actionEvent) {
    }

    public void BackOnClick(ActionEvent actionEvent) {
        view.openView("ProjectCreatorView");
    }
}
