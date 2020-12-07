package view.ProjectCreator;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ViewHandler;

public class AddMemberViewController {
    public Button Save;



    public void SaveOnClick(ActionEvent actionEvent) {
    }

    public void BackOnClick(ActionEvent actionEvent) {
        view.openView("ProjectCreatorView");
    }

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
}
