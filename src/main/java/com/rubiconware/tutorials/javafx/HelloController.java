package com.rubiconware.tutorials.javafx;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.logging.Level;

//import com.sun.media.jfxmedia.logging.Logger;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
public class HelloController {
	/**
	 * Version string for this class. Must be incremented with each PCR. Must
	 * match version in last line of Revision history.
	 */
	public static final String VERSION = "000";

	private int helloCount = 0;

	@FXML
	private Button buttonHello;

	@FXML
	private Label labelHelloResponse;




	@FXML
	private void giveResponse() {
		labelHelloResponse.setText("How you doing #" + helloCount++ + "? ");
	}




	public HelloController() {
		Logger.log(Level.CONFIG, "Starting " + HelloController.class.getSimpleName() + "(" + getVersion() + ")");
	}




	@FXML
	protected void exit() {
		Logger.log(Level.FINE, "exiting");
		Platform.exit();
	}




	public String getVersion() {
		String version = VERSION;
		return version;
	}




	@FXML
	protected void about() {

		Logger.log(Level.FINE, "Showing About info");
		labelHelloResponse.setText(HelloApp.class.getSimpleName() + " version " + getVersion());
	}




	/**
	 *
	 * @pre init complete.
	 * @post no change to object.
	 */
	public void status() {
		if (this.labelHelloResponse == null) {
			Logger.log(Level.SEVERE, "label is null");
		}
	}
}
