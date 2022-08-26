package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author Connor Wallace
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		GameService service = GameService.getInstance();
		
		System.out.println("\nAbout to test initializing game data...");
		
		// Initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		Game game3 = service.addGame("Game #3");
		System.out.println(game3);
		
		// Test if creating duplicates or not
		Game game1a = service.addGame("Game #1");
		System.out.println(game1a);
		
		// Test GameService
		GameServiceTester testerGS = new GameServiceTester();
		testerGS.testGameService(service);
		
		// Test Game
		GameTester testerG = new GameTester();
		testerG.testGame();
		
		// Test Team
		TeamTester testerT = new TeamTester();
		testerT.testTeam();
		
		// Use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
