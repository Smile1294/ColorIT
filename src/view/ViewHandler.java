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

//////////////////////////////////PROJECT CREATOR VARIABLES///////////////////
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


  public void closeView()
  {
    primaryStage.close();
  }



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
      /////////////////////////////DEVELOPER/////////////////////
      case "DeveloperRequirement":
        root = loadDeveloperRequirements("Developer/DeveloperRequirementsView.fxml");
        break;
      case "DeveloperTask":
        root = loadDeveloperTasks("Developer/DeveloperTaskTableView.fxml");
        break;
      case "DeveloperView":
        root = loadDeveloperView("Developer/DeveloperView.fxml");
        break;
      /////////////////////////PROJECT OWNER/////////////////////////
      case "ProjectOwnerRequirements":
        root = loadProjectOwnerRequirements("ProjectOwner/ProjectOwnerRequirementsView.fxml");
        break;
      case "ProjectOwnerView":
        root = loadProjectOwnerView("ProjectOwner/ProjectOwnerView.fxml");
        break;
      ///////////////////////PROJECT CREATOR///////////////////////////
      case "ProjectCreatorView":
        root = loadProjectCreatorView("ProjectCreator/ProjectCreatorView.fxml");
        break;
      case "AddMemberView":
        root = loadAddMemberView("ProjectCreator/AddMemberView.fxml");
        break;
      case "AssignRoleView":
        root = loadAssignRoleView("ProjectCreator/AssignRoleView.fxml");
        break;
      case "CreateProjectView":
        root = loadCreateProjectView("ProjectCreator/CreateProjectView.fxml");
        break;
      case "RemoveMemberView":
        root = loadRemoveMemberView("ProjectCreator/RemoveMemberView.fxml");
        break;
      case "RequirementsView":
        root = loadRequirementsView("ProjectCreator/RequirementsView.fxml");
        break;
      case "TasksView":
        root = loadTasksView("ProjectCreator/TasksView.fxml");
        break;
      //////////////////////////////SCRUM MASTER////////////////////////////////
      case "ScrumMasterRequirementsView":
        root = loadScrumMasterRequirementsView("ScrumMaster/ScrumMasterRequirementsView.fxml");
        break;
      case "ScrumMasterTaskTableView":
        root = loadScrumMasterTaskTableView("ScrumMaster/ScrumMasterTaskTableView.fxml");
        break;
      case "ScrumMasterView":
        root = loadScrumMasterView("ScrumMaster/ScrumMasterView.fxml");
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

  public Region loadDeveloperRequirements(String fxmlFile){
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

  public Region loadDeveloperTasks(String fxmlFile){
    if(developerTaskTableViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        developerTaskTableViewController = loader.getController();
        developerTaskTableViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return developerTaskTableViewController.getRoot();
  }

  public Region loadDeveloperView(String fxmlFile){
    if(developerViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        developerViewController = loader.getController();
        developerViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return developerViewController.getRoot();
  }

  //////////////////////////////PROJECT OWNER////////////////////////
  public Region loadProjectOwnerRequirements(String fxmlFile){
    if(projectOwnerRequirementsViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        projectOwnerRequirementsViewController = loader.getController();
        projectOwnerRequirementsViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return projectOwnerRequirementsViewController.getRoot();
  }

  public Region loadProjectOwnerView(String fxmlFile){
    if(projectOwnerViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        projectOwnerViewController = loader.getController();
        projectOwnerViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return projectOwnerViewController.getRoot();
  }

  //////////////////////////////PROJECT CREATOR////////////////////////////////////
  private Region loadProjectCreatorView(String fxmlFile){
    if(projectCreatorViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        projectCreatorViewController = loader.getController();
        projectCreatorViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    else {
      projectCreatorViewController.reset();
    }
    return projectCreatorViewController.getRoot();
  }

  private Region loadAddMemberView(String fxmlFile){
    if(addMemberViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        addMemberViewController = loader.getController();
        addMemberViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return addMemberViewController.getRoot();
  }

  private Region loadAssignRoleView(String fxmlFile){
    if(assignRoleViewContoller == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        assignRoleViewContoller = loader.getController();
        assignRoleViewContoller.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return assignRoleViewContoller.getRoot();
  }

  private Region loadRemoveMemberView(String fxmlFile){
    if(removeMemberViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        removeMemberViewController = loader.getController();
        removeMemberViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return removeMemberViewController.getRoot();
  }

  private Region loadRequirementsView(String fxmlFile){
    if(requirementsViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        requirementsViewController = loader.getController();
        requirementsViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    else {
      requirementsViewController.reset();
    }
    return requirementsViewController.getRoot();
  }

  private Region loadTasksView(String fxmlFile){
    if(tasksViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        tasksViewController = loader.getController();
        tasksViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return tasksViewController.getRoot();
  }

  private Region loadCreateProjectView(String fxmlFile){
    if(createProjectViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        createProjectViewController = loader.getController();
        createProjectViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    else {
      createProjectViewController.reset();
    }
    return createProjectViewController.getRoot();
  }

  //////////////////////////SCRUM MASTER/////////////////////////
  public Region loadScrumMasterRequirementsView(String fxmlFile){
    if(scrumMasterRequirementsViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        scrumMasterRequirementsViewController = loader.getController();
        scrumMasterRequirementsViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return scrumMasterRequirementsViewController.getRoot();
  }

  public Region loadScrumMasterTaskTableView(String fxmlFile){
    if(scrumMasterTaskTableViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        scrumMasterTaskTableViewController = loader.getController();
        scrumMasterTaskTableViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return scrumMasterTaskTableViewController.getRoot();
  }
  public Region loadScrumMasterView(String fxmlFile){
    if(scrumMasterViewController == null) {
      try {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlFile));
        root = loader.load();
        scrumMasterViewController = loader.getController();
        scrumMasterViewController.init(root,this, model);
      }
      catch (Exception e){
        e.printStackTrace();
      }
    }
    return scrumMasterViewController.getRoot();
  }



}
