package com.gamingroom;

/**
 * A class to test the GameService functions
 * 
 * @author Connor Wallace
 */
public class GameServiceTester {
	
	public void testGameService(GameService service){
		// Test getGame by name method with good call
		System.out.println("Game #1 get: "+ service.getGame("Game #1"));
		System.out.println();
		// Test getGame method with null call
		System.out.println("Game #DNE get: "+ service.getGame("Game #DNE"));
				
		// Test getGame by id method with good call
		long testId = 1;
		System.out.println("Game id 1 get: "+ service.getGame(testId));
		System.out.println();
		// Test getGame method with null call
		testId = -1;
		System.out.println("Game id -1 get: "+ service.getGame(testId));
		System.out.println();
	}
}
