package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneBuilderLearn extends Application {

	
	public static void main(String [] a) {
		launch(a);
	}
	
	
	@Override
	public void start(Stage stage){
		
		try {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
