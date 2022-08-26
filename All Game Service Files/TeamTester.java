package com.gamingroom;

/**
 * A class to test a Team's behavior
 * 
 * @author Connor Wallace
 */

public class TeamTester {
	public void testTeam() {
		String name;

		System.out.println("\nCreating a test team");
		Team team = new Team(-1, "testGame");
		
		System.out.println("\nAdding test players");
		for (int i = 0; i <5; ++i) {
			name = "test player " + i;
			team.addPlayer(name);	
		}
		
		System.out.println("\nPrinting test players");
		team.printPlayers();
		
		System.out.println("\nTesting addPlayer with a player that already exists");
		name = "test player double";
		team.addPlayer(name);	
		team.addPlayer(name);	
		
		System.out.println("\nPrinting test players");
		team.printPlayers();
	}
}
