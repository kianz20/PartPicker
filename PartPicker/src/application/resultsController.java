package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;

public class resultsController {

	@FXML
	private Button mainMenuButton;
	@FXML
	private Label GPULabel;
	@FXML
	private Label CPULabel;
	@FXML
	private Label wattsLabel;
	@FXML
	private Label RAMLabel;
	@FXML
	private Hyperlink GPULink;
	@FXML
	private Hyperlink CPULink;
	@FXML
	private Hyperlink benchmarkLink;
	@FXML
	private Hyperlink RAMLink;
	
	String gameName = "";
	
	public void returnToMainMenu(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(resultsController.class.getResource("mainMenu.fxml"));
		Parent root = (Parent) loader.load();
		Stage stage = (Stage) mainMenuButton.getScene().getWindow();
		Scene scene = new Scene(loader.getRoot());
		stage.setScene(scene);
	}
	
	public void setGPULabel(String Text) {
		GPULabel.setText(Text);
	}
	
	public void setCPULabel(String Text) {
		CPULabel.setText(Text);
	}
	
	public void setWattsLabel(String Text) {
		wattsLabel.setText(Text);
	}
	
	public void openGPULink(ActionEvent event) throws IOException, URISyntaxException {
		String GPUURL = "https://pricespy.co.nz/search?search=" + GPULabel.getText();
		GPUURL = GPUURL.replaceAll(" ", "_");
		Desktop.getDesktop().browse(new URI(GPUURL));
	}
	
	public void openCPULink(ActionEvent event) throws IOException, URISyntaxException { 
		String CPUURL = "https://pricespy.co.nz/search?search=" + CPULabel.getText();
		CPUURL = CPUURL.replaceAll(" ", "_");
		Desktop.getDesktop().browse(new URI(CPUURL));
	}
	
	public void openRAMLink(ActionEvent event) throws IOException, URISyntaxException { 
		String RAMURL = "https://pricespy.co.nz/search?search=" + RAMLabel.getText();
		RAMURL = RAMURL.replaceAll(" ", "_");
		Desktop.getDesktop().browse(new URI(RAMURL));
	}
	
	public void getGame(String game) {
		gameName = game;
		benchmarkLink.setText(game + " Benchmarks");
	}
	
	public void openBenchmark(ActionEvent event) throws IOException, URISyntaxException {
		String benchmarkURL = "https://www.youtube.com/results?search_query=" + CPULabel.getText() + "+" + GPULabel.getText() + "+" + gameName + "+Benchmarks";
		benchmarkURL = benchmarkURL.replaceAll(" ", "+");
		Desktop.getDesktop().browse(new URI(benchmarkURL));
	}
}
