

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MyController implements Initializable {

    @FXML
    private TextField t1;

    @FXML
    private TextField t2;

    @FXML
    private Button b1;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
        t1.setPromptText("enter text here then press button 1");
	}
    //method so that the controller created for second view can update the text
    //field with the text from the first view
	public void button1Method(ActionEvent e) throws IOException {
	    String s = t1.getText();
        s += " : from the center text field!";
        t2.setText(s);
        b1.setDisable(true);
        b1.setText("pressed");
	}
	
	public void button2Method(ActionEvent e) throws IOException{
        t1.clear();
        t2.clear();
        t2.setText("final string goes here");
        b1.setDisable(false);
        b1.setText("button 1");
	}
}
