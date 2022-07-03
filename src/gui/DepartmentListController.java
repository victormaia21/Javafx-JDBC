package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.entities.Department;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class DepartmentListController implements Initializable{

	@FXML
	private Button button;
	
	@FXML
	private TableView<Department>deparmenttable;
	
	@FXML
	private TableColumn<Department, String>tablename;
	
	@FXML
	private TableColumn<Department, Integer>tableid;
	
	public void onbuttonaction() {

	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Initializenode();
		
	}


	private void Initializenode() {
		tablename.setCellValueFactory(new PropertyValueFactory<>("Name"));
		tableid.setCellValueFactory(new PropertyValueFactory<>("Id"));
		
		Stage stage = ((Stage) Main.getmainscene().getWindow());
		deparmenttable.prefHeightProperty().bind(stage.heightProperty());
		
	}

	
}
