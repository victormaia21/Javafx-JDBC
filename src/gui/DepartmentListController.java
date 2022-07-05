package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import gui.entities.Department;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Departmentservice;

public class DepartmentListController implements Initializable{

	
	private Departmentservice service;
	
	@FXML
	private Button button;
	
	@FXML
	private TableView<Department>tabledepartment;
	
	@FXML
	private TableColumn<Department, String>tablename;
	
	@FXML
	private TableColumn<Department, Integer>tableid;
	
	private ObservableList<Department>obslist;

	
	 
	
	public void onbuttonaction() {

	}
	
	
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Initializenode();
		
	}
	
	public void setdepartmentservice(Departmentservice service) {
		this.service = service;
	}
	
	


	private void Initializenode() {
		tablename.setCellValueFactory(new PropertyValueFactory<>("Name"));
		tableid.setCellValueFactory(new PropertyValueFactory<>("Id"));
		
		Stage stage = ((Stage) Main.getmainscene().getWindow());
		tabledepartment.prefHeightProperty().bind(stage.heightProperty());
		
	}
	
	public void updatedepartmentservice() {
		if(service == null) {
			throw new IllegalStateException("NÃO EXISTE UMA LISTA DE DEPARTMENT");
		}
		List<Department>list = service.findall();
		obslist = FXCollections.observableArrayList(list);
		tabledepartment.setItems(obslist);
	}
	
	
	
	

	
}
