package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//creating a root node
		Group root = new Group();
		//adding a root to scene
		Scene scene = new Scene(root,Color.BLACK);
		Image icon = new Image("icon.png");
		stage.setHeight(500);
		 stage.setWidth(800);
		 stage.setResizable(false);
		 
		 //stage.setX(500); - Position of the window when open
		 //stage.setY(50);
		//setting a scene stage
		 //stage.setFullScreen(true); - always open in fullscreen mode
		 //stage.setFullScreenExitHint("press q to quit"); - message to exit fullscreen
		 //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q")); - setting a char to quit
		stage.setScene(scene);
		stage.getIcons().add(icon);
		stage.setTitle("New App");
		stage.show();

	}

}
