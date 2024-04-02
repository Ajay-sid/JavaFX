package sceneBuilderWithController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EventsHandling extends Application {

	public static void main(String [] a) {
		launch(a);
	}
	
	
	@Override
	public void start(Stage stage) {
		// TODO Auto-generated method stub
		try {
		Parent root = FXMLLoader.load(getClass().getResource("EvenHandle.fxml"));
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
