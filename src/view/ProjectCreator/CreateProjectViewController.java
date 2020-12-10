package view.ProjectCreator;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import model.*;
import view.*;
import view.RequiementsListViewModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class CreateProjectViewController {
    public Button Create;
    public TextField Title;
    public DatePicker DateForDeadline;


    private Region root;
    private ViewHandler view;
    private ProjectListModel model;
    private RequiementsListViewModel smodel;
    private ProjectListViewModel pmodel;

    public CreateProjectViewController()
    {

    }
    public void init(Region root, ViewHandler view, ProjectListModel model){
        this.root = root;
        this.view = view;
        this.smodel = new RequiementsListViewModel(model);
        this.pmodel = new ProjectListViewModel(model);
        this.model = model;

    }





    public void CreateOnClick() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate();
        String[] ll = new String[3];
        ll = dateFormat.format(date).split("/");
        date1.set(Integer.parseInt(ll[0]),Integer.parseInt(ll[1]),Integer.parseInt(ll[2]));
        date2.set(DateForDeadline.getValue().getDayOfMonth(),DateForDeadline.getValue().getMonthValue(),DateForDeadline.getValue().getYear());
        Status a = new Status();
        ArrayList<Requirement> r = new ArrayList<>();
        Project pt = new Project(Title.getText(),new Start_DeadLine(date1, date2));


        model.addProject(pt);
        Title.setText("");
        view.openView("ProjectCreatorView");
    }

    public void BackOnClick(ActionEvent actionEvent) {
        view.openView("ProjectCreatorView");
    }


    public void reset()
    {
        smodel.update();
    }

    public Region getRoot()
    {
        return root;
    }
}
