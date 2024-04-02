package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SceneLearn extends Application{
public static void main (String[] args) {
	launch(args);
}
	@Override
	public void start(Stage arg0) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root,600,600,Color.LIGHTBLUE);
		Stage stage = new Stage();
		
		Text text = new Text();
		text.setText("Elden Ring");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana",50));
		text.setFill(Color.MAGENTA);
		
		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(500);
		line.setEndY(200);
		line.setStrokeWidth(5);
		line.setStroke(Color.MAGENTA);
		line.setOpacity(0.5);
		
		//We also have shapes like rectangle,triangle class
		
		root.getChildren().add(text);
		root.getChildren().add(line);
		stage.setScene(scene);
		stage.show();
		
		
	}

}
