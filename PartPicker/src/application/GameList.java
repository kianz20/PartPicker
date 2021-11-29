package application;

import java.util.ArrayList;

public class GameList extends ChooseGameController{
	ArrayList<String> listOfGames = new ArrayList<String>();
	// Array that contains the different games
	public GameList() {
		
		// Game names
		listOfGames.add("Fortnite");  
		listOfGames.add("Apex Legends"); 
		listOfGames.add("Crysis 3"); 
		
	}
	public ArrayList<String> returnArray() {
		return this.listOfGames;
	}
}
