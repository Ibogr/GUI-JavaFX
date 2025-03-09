//Simple Tutorial week 3
package application;

import javafx.application.Application;
import javafx.stage.Stage;
/* - to see a window -
 * 1 show primary stage
 * 2 launch the app*/
public class Simple extends Application {

	public static void main(String[] args) {
		// launch the application
		launch(args);

	}
	// window management and layouts
	@Override
	public void start(Stage primaryStage) throws Exception {
				// window = stage = root
		// set the title of the window
		primaryStage.setTitle("Simple Tutorial");

		
		
		// show the main window
		primaryStage.show();
		
	}

}
