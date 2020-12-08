package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Project;
import model.ProjectListModel;
import model.Requirement;
import model.Task;

public class TaskListViewModel {
  private ObservableList<TaskViewModel> list;
  private ProjectListModel model;

  public TaskListViewModel(ProjectListModel model){
    this.model = model;
    this.list = FXCollections.observableArrayList();
    update();
  }
  public void update()
  {
    list.clear();
    for(int x = 0; x < model.projectListSize(); x++){
      for(int z = 0; z < model.getProject(x).getRequirements().size(); z++){
        for(int y = 0; y < model.getProject(x).getRequirement(z).getTaskListSize(); y++){
          list.add(new TaskViewModel(model.getProject(x).getRequirement(y).getTask(y)));
        }
      }
    }
  }
  public ObservableList<TaskViewModel> getList()
  {
    return list;
  }

  public void remove(Task task)
  {
    for(int x = 0; x < model.projectListSize(); x++){
      for(int z = 0; z < model.getProject(x).getRequirements().size(); z++){
        for(int y = 0; y < model.getProject(x).getRequirement(z).getTaskListSize(); y++){
          if(model.getProject(x).getRequirement(z).getTask(y).getTitle().equals(task.getTitle()) &&
              model.getProject(x).getRequirement(z).getTask(y).getTaskStatus().equals(task.getTaskStatus())){
            list.remove(task);
          }
        }
      }
    }
  }
  public void add(Task task)
  {
    list.add(new TaskViewModel(task));
  }
}
