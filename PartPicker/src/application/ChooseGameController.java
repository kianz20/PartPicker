package application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ChooseGameController {

	@FXML
	private Button findPCButton;
	@FXML
	private Button cantFindButton;
	@FXML
	private ChoiceBox<String> chooseGameBox;
	@FXML
	private Label errorLabel;

	public void initialize() {
		GameList gameListInstance = new GameList();
		ArrayList<String> listOfGames = gameListInstance.returnArray();
		chooseGameBox.setItems(FXCollections.observableArrayList(listOfGames));
		errorLabel.setVisible(false);
	}
	
	public void cantFindAction(ActionEvent event) throws IOException, URISyntaxException {
		String benchmarkURL = "https://forms.gle/sQCQCE3qhcWVNRZg9";
		benchmarkURL = benchmarkURL.replaceAll(" ", "+");
		Desktop.getDesktop().browse(new URI(benchmarkURL));
	}

	public void searchForPC(ActionEvent event) throws IOException {
		try {
		GamePartPicker partPicker = new GamePartPicker();
		FXMLLoader loader = new FXMLLoader(resultsController.class.getResource("resultsScreen.fxml"));
		Parent root = (Parent) loader.load();
		
		resultsController resultsController = loader.getController();
		resultsController.setGPULabel(partPicker.getGPU(chooseGameBox.getSelectionModel().getSelectedItem())[0]);
		resultsController.setCPULabel(partPicker.getCPU(chooseGameBox.getSelectionModel().getSelectedItem())[0]);
		resultsController.getGame(chooseGameBox.getSelectionModel().getSelectedItem());
		int pConsumption = Integer.parseInt(partPicker.getGPU(chooseGameBox.getSelectionModel().getSelectedItem())[1]) + Integer.parseInt(partPicker.getCPU(chooseGameBox.getSelectionModel().getSelectedItem())[1]);
		resultsController.setWattsLabel(Integer.toString(pConsumption) + "W");
		
		Stage stage = (Stage) findPCButton.getScene().getWindow();
		Scene scene = new Scene(loader.getRoot());
		stage.setScene(scene);
		
		} catch (Exception e) {
			errorLabel.setVisible(true);
		}
		
	}
}

