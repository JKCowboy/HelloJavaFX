package com.rubiconware.tutorials.javafx;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class DOES_SOMETHING.
 * 
 * <pre>
 * Revision History
 * PCR      Version   Author          Date        Comment
 * CZZZZ    000       jack         Feb 25, 2016     Class Created.
 * </pre>
 * 
 * @author jack
 * @version {@value #VERSION}
 */
public class HelloApp extends Application {

	public static void main(String[] args) {
		Application.launch(HelloApp.class, args);
	}




	@Override
	public void start(Stage stage) throws Exception {
		// Parent root =
		// FXMLLoader.load(getClass().getResource("FontFileEditorFX.fxml"));
		URL location = getClass().getResource("HelloApp.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(location);
		fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
		Parent root = (Parent) fxmlLoader.load(location.openStream());

		stage.setTitle("Hello JavaFX");
		stage.setScene(new Scene(root, 1000, 1000));
		stage.show();

		HelloController controller = fxmlLoader.getController();
		controller.status();
		// controller.setup();
	}
}
