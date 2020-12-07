package view.Welcome;

import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ViewHandler;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class WelcomeViewController {

    public Button Developer;
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

    public void DeveloperOnClick() {
        view.openView("DeveloperView");
    }

    public void ProjectCreatorOnPress() {
        view.loadProjectCreator("");
    }

    public void ProjectOwnerOnCLick() {
    }

    public void ScrumMasterOnClick() {
    }

    public void QuitOnClick() {
        view.closeView();
    }
}
