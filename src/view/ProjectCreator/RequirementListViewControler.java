package view.ProjectCreator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import model.ProjectListModel;
import view.ProjectListViewModel;
import view.RequiementsListViewModel;
import view.RequiementsViewModel;
import view.ViewHandler;

public class RequirementListViewControler {
  @FXML private Button Add;
  @FXML private Button Show;
  @FXML  private Button Back;

  public TableView<RequiementsViewModel> RequirementsTable;
  @FXML private TableColumn<RequiementsViewModel,String> Who;
  @FXML private TableColumn<RequiementsViewModel,String> What;
  @FXML private TableColumn<RequiementsViewModel,String> IDS;
  @FXML private TableColumn<RequiementsViewModel,String> Why;

  private Region root;
  private ViewHandler view;
  private ProjectListModel model;
  private RequiementsListViewModel smodel;
  private ProjectListViewModel pmodel;

  public RequirementListViewControler()
  {

  }
  public void init(Region root, ViewHandler view, ProjectListModel model){
    this.root = root;
    this.view = view;
    this.smodel = new RequiementsListViewModel(model);
    this.pmodel = new ProjectListViewModel(model);
    this.model = model;

    Who.setCellValueFactory(cellData -> cellData.getValue().getWho());
    What.setCellValueFactory(cellData -> cellData.getValue().getWhat());
    Why.setCellValueFactory(cellData -> cellData.getValue().getWhy());
    IDS.setCellValueFactory(cellData -> cellData.getValue().getID());

    RequirementsTable.setItems(smodel.getList());
  }


  public void AddOnClick(ActionEvent actionEvent) {
    view.openView("RequirementsView");
  }

  public void ShowOnClick(ActionEvent actionEvent) {
  }

  public void BackOnClick(ActionEvent actionEvent) {
    for(int x = 0; x < model.getProjects().getSize(); x++){
      if (model.isProjectOpened(x)){
        model.getProject(x).setOpened(false);
      }
    }
    view.openView("ProjectCreatorView");
  }

  public void reset()
  {
    System.out.println(model.getProjects().getSize());
    if (model.getProject(model.getProjects().getSize()-1).getRequirements().size() != 0)
    smodel.add(model.getProject(model.getProjects().getSize()-1).getRequirement(0));

    System.out.println(smodel.getList().get(0).getID());
    smodel.update();
  }

  public Region getRoot()
  {
    return root;
  }
}
