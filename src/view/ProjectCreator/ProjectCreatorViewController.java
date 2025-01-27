package view.ProjectCreator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.Project;
import model.ProjectListModel;
import view.ProjectListViewModel;
import view.ProjectViewModel;
import view.ViewHandler;


public class ProjectCreatorViewController {
    public Button AssignRole;
    public Button RemoveMember;
    public Button CreateProject;
    public TextField SearchProject;
    public Button AddMember;
    public Button EditProject;
    public Button DeleteProject;

    public TableView<ProjectViewModel> ProjectList;
    public TableColumn<ProjectViewModel, String> title;
    public TableColumn<ProjectViewModel, String> startDate;
    public TableColumn<ProjectViewModel, String> deadLine;
    public TableColumn<ProjectViewModel, String> state;


    private Region root;
    private ViewHandler view;
    private ProjectListViewModel smodel;
    private ProjectListModel model;

    public void init(Region root, ViewHandler view, ProjectListModel model){
        this.root = root;
        this.view = view;
        this.model = model;
        this.smodel = new ProjectListViewModel(model);

        title.setCellValueFactory(cellData -> cellData.getValue().getProjectTitle());
        startDate.setCellValueFactory(cellData -> cellData.getValue().getProjectStartDate());
        deadLine.setCellValueFactory(cellData -> cellData.getValue().getProjectDeadLine());
        //state.setCellValueFactory(cellData -> cellData.getValue().getProjectState());

        ProjectList.setItems(smodel.getList());
    }

    public void reset()
    {
        smodel.update();
    }

    public Region getRoot(){
        return root;
    }


    public void BackOnClick(ActionEvent actionEvent) {
        view.openView("Welcome");
    }

    public void CreateProjectOnClick(ActionEvent actionEvent) {
        view.openView("CreateProjectView");
    }


    public void RemoveMemberOnClick(ActionEvent actionEvent) {
        view.openView("RemoveMemberView");
    }

    public void AddMemberOnClick(ActionEvent actionEvent) {
        view.openView("AddMemberView");
    }

    public void EditProjectOnClick(ActionEvent actionEvent) {
        view.openView("");
    }

    public void DeleteProjectOnClick(ActionEvent actionEvent) {
        view.openView("Welcome");
    }

    public void ShowRequirementsClick(ActionEvent actionEvent) {
        ProjectViewModel selectedProject = ProjectList.getSelectionModel().getSelectedItem();
        if(selectedProject != null){
            for (int x = 0; x < model.getProjects().getSize(); x++){
                if (model.getProject(x).getTitle()
                    .equals(selectedProject.getProjectTitle().get())){
                    model.getProject(x).setOpened(true);
                }
            }
            view.openView("RequirementListView");
        }
    }
}
