package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChoosePriceController {
	
	

	@FXML
	private Button findPCButton;
	@FXML 
	private TextField priceInput;
	
	public void searchForPC(ActionEvent event) throws IOException {
		PricePartPicker partPicker = new PricePartPicker();
		FXMLLoader loader = new FXMLLoader(resultsController.class.getResource("resultsScreen.fxml"));
		Parent root = (Parent) loader.load();
		
		resultsController resultsController = loader.getController();
		resultsController.setGPULabel(partPicker.getGPU(Integer.parseInt(priceInput.getText()))[0]);
		resultsController.setCPULabel(partPicker.getCPU(Integer.parseInt(priceInput.getText()))[0]);
		int pConsumption = Integer.parseInt(partPicker.getGPU(Integer.parseInt(priceInput.getText()))[1]) + Integer.parseInt(partPicker.getCPU(Integer.parseInt(priceInput.getText()))[1]);
		resultsController.setWattsLabel(Integer.toString(pConsumption) + "W");
		
		Stage stage = (Stage) findPCButton.getScene().getWindow();
		Scene scene = new Scene(loader.getRoot());
		stage.setScene(scene);
	}
}
