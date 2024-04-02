module zApp {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens sceneBuilderWithController to javafx.graphics, javafx.fxml;
}
