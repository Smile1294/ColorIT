package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.ProjectListModel;
import model.Requirement;

public class RequiementsListViewModel {
  private ObservableList<RequiementsViewModel> list;
  private ProjectListModel model;

  public RequiementsListViewModel(ProjectListModel model){
    this.model = model;
    this.list = FXCollections.observableArrayList();
    update();
  }
  public void update()
  {
    list.clear();
    for (int i = 0; i < model.RequirementsListSize(); i++)
    {
      list.add(new RequiementsViewModel(model.getRequirement(i)));
    }
  }

  public ObservableList<RequiementsViewModel> getList()
  {
    return list;
  }


  public void add(Requirement requirement)
  {
    list.add(new RequiementsViewModel(requirement));
  }
}