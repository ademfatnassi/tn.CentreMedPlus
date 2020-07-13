import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StartPageController implements Initializable {

	@FXML private AnchorPane rootPane;
	
	@FXML private void changeScreenButtonPushed(ActionEvent event) throws IOException
	{
		Parent homeParent = FXMLLoader.load(getClass().getResource("/Home.fxml"));
		
		Scene homeScene = new Scene(homeParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(homeScene);
		
		window.setFullScreen(true);
		
		window.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
