package view.Welcome;

import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ViewHandler;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class WelcomeViewController {

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
    }

    public void ProjectCreatorOnPress() {
    }

    public void ProjectOwnerOnCLick() {
    }

    public void ScrumMasterOnClick() {
    }

    public void QuitOnClick() {
    }
}