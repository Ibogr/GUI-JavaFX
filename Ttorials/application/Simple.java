package application;

import java.awt.Label;

import javafx.application.Application;
import javafx.stage.Stage;

public class Simple extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// set the title of window
		primaryStage.setTitle("Java-FX");
		// set the default width of the window
		primaryStage.setWidth(600);
		// set the default height of the window
		primaryStage.setHeight(650);
		
		
		//show the window on the screen
		primaryStage.show();
		
	}
	

}
