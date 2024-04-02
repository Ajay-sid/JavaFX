package sceneBuilderWithController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;

public class Controller {

	@FXML
	private Circle mySphere;
	private double x;
	private double y;
	
	public void NE(ActionEvent e) {
		System.out.println("North East");
		mySphere.setCenterX(x=x+10);
		mySphere.setCenterY(y=y-10);
	}
	public void NW(ActionEvent e) {
		System.out.println("North West");
		mySphere.setCenterX(x=x-10);
		mySphere.setCenterY(y=y-10);
	}
	public void SW(ActionEvent e) {
		System.out.println("South West");
	}
	public void SE(ActionEvent e) {
		System.out.println("South East");
	}
	public void reset(ActionEvent e)
	{
		mySphere.setCenterX(x=0);
		mySphere.setCenterY(y=0);
	}
}
