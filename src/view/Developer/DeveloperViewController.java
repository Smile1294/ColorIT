package view.Developer;

import javafx.event.ActionEvent;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ViewHandler;

public class DeveloperViewController {

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
