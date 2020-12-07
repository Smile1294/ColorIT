package view.ScrumMaster;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ViewHandler;

import java.awt.*;

public class ScrumMasterViewController {


    public TextField searchProject;
    public TableColumn projectList;
    private Region root;
    private ViewHandler viewHandler;
    private ProjectListModel model;


    public void BackOnClick()
    {
        viewHandler.openView("Welcome");
    }

    public Region getRoot() {
        return root;
    }

    public void init(Region root, ViewHandler viewHandler, ProjectListModel model) {
        this.model = model;
        this.root = root;
        this.viewHandler = viewHandler;
    }
}
