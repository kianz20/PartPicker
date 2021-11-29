package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;

public class ChooseTypeController {
	
	
	@FXML
	private Button chooseGameButton;
	@FXML
	private Button choosePriceButton;
	
	public void chooseGame(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("chooseGame.fxml");
	}
	
	public void choosePricePoint(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("choosePrice.fxml");
		
	}
	
	
	
}
