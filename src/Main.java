
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("StartPage.fxml"));

		Scene scene = new Scene(root);

		stage.setScene(scene);

		stage.initStyle(StageStyle.DECORATED);
		
		String css = getClass().getResource("style.css").toExternalForm();
		scene.getStylesheets().addAll(css);

		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
