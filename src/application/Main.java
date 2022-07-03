package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;


        

public class Main extends Application {
	
	private static Scene mainScene;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/mainview.fxml"));
			ScrollPane sp = loader.load();
			sp.setFitToHeight(true);
			sp.setFitToWidth(true);
			mainScene = new Scene(sp);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public static Scene getmainscene() {
		return mainScene;
	}
}
