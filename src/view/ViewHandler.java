package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.ProjectListModel;
import view.Developer.DeveloperRequirementsViewController;
import view.Developer.DeveloperTaskTableViewController;
import view.Developer.DeveloperViewController;
import view.ProjectCreator.*;
import view.ProjectOwner.ProjectOwnerRequirementsViewController;
import view.ProjectOwner.ProjectOwnerViewController;
import view.ScrumMaster.ScrumMasterRequirementsViewController;
import view.ScrumMaster.ScrumMasterTaskTableViewController;
import view.ScrumMaster.ScrumMasterViewController;
import view.Welcome.WelcomeViewController;



public class ViewHandler {

  private Scene currentScene;
  private Stage primaryStage;
  private Region root;
  private ProjectListModel model;

////////////////////////////DEVELOPER VARIABLES//////////////////////
  private DeveloperRequirementsViewController developerRequirementsViewController;
  private DeveloperTaskTableViewController developerTaskTableViewController;
  private DeveloperViewController developerViewController;

////////////////////////////////PROJECT CREATOR VARIABLES////////////////
  private AddMemberViewController addMemberViewController;
  private AssignRoleViewContoller assignRoleViewContoller;
  private CreateProjectViewController createProjectViewController;
  private ProjectCreatorViewController projectCreatorViewController;
  private RemoveMemberViewController removeMemberViewController;
  private RequirementsViewController requirementsViewController;
  private TasksViewController tasksViewController;

////////////////////////PROJECT OWNER VARIABLES//////////////////
  private ProjectOwnerRequirementsViewController projectOwnerRequirementsViewController;
  private ProjectOwnerViewController projectOwnerViewController;

/////////////////////SCRUM MASTER VARIABLES//////////////////
  private ScrumMasterRequirementsViewController scrumMasterRequirementsViewController;
  private ScrumMasterTaskTableViewController scrumMasterTaskTableViewController;
  private ScrumMasterViewController scrumMasterViewController;

//////////////////////////MAIN VIEW VARIABLE//////////////////
  private WelcomeViewController welcomeViewController;




  public ViewHandler(ProjectListModel model){
    currentScene = new Scene(new javafx.scene.layout.Region());
    this.model = model;
  }
  public void start(Stage primaryStage){
    this.primaryStage = primaryStage;
    openView("Welcome");
  }
  public void openView(String id){
    root = null;
    switch (id){
      case "Welcome":
        root = loadWelcome("Welcome/WelcomeView.fxml");
        break;
      case "DeveloperRequirement":
        root = loadDeveloperRequirement("Welcome/DeveloperRequirementsView.fxml");
        break;
    }
    currentScene.setRoot(root);
    primaryStage.setScene(currentScene);
    primaryStage.setTitle(id);
    primaryStage.setWidth(root.getPrefWidth());
    primaryStage.setHeight(root.getPrefHeight());
    primaryStage.show();
  }


  ///////////////////////////WELCOME///////////////////////////////

  public Region loadWelcome(String fxmlFile){
    if(welcomeViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        welcomeViewController = loader.getController();
        welcomeViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return welcomeViewController.getRoot();
  }

 //////////////////////////DEVELOPER////////////////////////////////////

  public Region loadDeveloperRequirement(String fxmlFile){
    if(developerRequirementsViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        developerRequirementsViewController = loader.getController();
        developerRequirementsViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return developerRequirementsViewController.getRoot();
  }
}
