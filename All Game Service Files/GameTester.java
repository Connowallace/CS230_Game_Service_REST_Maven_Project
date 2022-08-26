package com.gamingroom;

/**
 * A class to test the Game functions
 * 
 * @author Connor Wallace
 */

public class GameTester {
	public void testGame() {
		String name;
		
		System.out.println("Creating a test game");
		Game game = new Game(-1, "testGame");
		
		System.out.println("\nAdding test teams");
		for (int i = 0; i <5; ++i) {
			name = "test team " + i;
			game.addTeam(name);	
		}
		
		System.out.println("\nPrinting test teams");
		game.printTeams();
		
		System.out.println("\nTesting addTeam with a team that already exists");
		name = "test team double";
		game.addTeam(name);	
		game.addTeam(name);	
		
		System.out.println("\nPrinting test teams");
		game.printTeams();
	}
}
