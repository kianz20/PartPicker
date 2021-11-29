package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {

	private static Stage stg;
	
	@Override
	public void start(Stage primaryStage) throws IOException {

		stg = primaryStage;
		primaryStage.setResizable(false);
		primaryStage.setTitle("PC Builder");
		primaryStage.getIcons().add(new Image("file:img/pctransparent.PNG"));
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
		Scene scene = new Scene(root,600,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}



	public void changeScene(String fxml) throws IOException {
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(pane);
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
