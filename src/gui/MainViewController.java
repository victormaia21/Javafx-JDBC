package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import model.entities.Departmentservice;

public class MainViewController implements Initializable{

	@FXML
	private MenuItem MenuDepartment;
	
	@FXML
	private MenuItem MenuSeller;
	
	@FXML
	private MenuItem menuAbout;
	
	@FXML
	public void actionmenudepartment() {
		loadview("/gui/Departmentview.fxml", (DepartmentListController controller) -> {controller.setdepartmentservice(new Departmentservice());
		controller.updatedepartmentservice();});
	}
		                                       
	
	@FXML
	public void actionmenuseller() {
		
	}
	
	@FXML
	public void actionabout() {
		loadview("/gui/AboutView.fxml", x -> {});
	}
	
	
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
	public  <T> void  loadview(String url, Consumer<T>actiondep) {
		try {
			
		FXMLLoader fl = new FXMLLoader(getClass().getResource(url));
		VBox aboutview = fl.load();
		Scene scene = Main.getmainscene();
		VBox mainview = (VBox) ((ScrollPane) scene.getRoot()).getContent();
		Node mainmenu = mainview.getChildren().get(0);
		mainview.getChildren().clear();
		mainview.getChildren().add(mainmenu);
		mainview.getChildren().addAll(aboutview);
		
		T controller = fl.getController();
		actiondep.accept(controller);
		
		
		
		
		}
		catch(IOException e) {
			Alerts.showAlert("ERRO DE EXCESS�O", "IOEXCEPTION", e.getMessage(), AlertType.ERROR);
		}
		
	}
	
	
	
	

	
}
