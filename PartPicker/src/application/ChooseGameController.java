package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class ChooseGameController {

	@FXML
	private Button findPCButton;
	@FXML
	private ChoiceBox<String> chooseGameBox;

	public void initialize() {
		GameList gameListInstance = new GameList();
		ArrayList<String> listOfGames = gameListInstance.returnArray();
		chooseGameBox.setItems(FXCollections.observableArrayList(listOfGames));
	}

	public void searchForPC(ActionEvent event) throws IOException {
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
		
	}
}

