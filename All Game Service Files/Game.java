package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * @author Connor Wallace
 *
 */
public class Game extends Entity {
	
	private List<Team> teams = new ArrayList<Team>();
	
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
	}

	
	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this();
		this.setId(id);
		this.setName(name);
	}

	
	/**
	 * Add a team to the team list if it does not already exist
	 */
	public Team addTeam(String name) {
		// local Team instance
		Team tempTeam = null;
		
		// Creates an Iterator that will go through the variable games
		Iterator<Team> myIterator = teams.iterator();
				
		// This loop will execute as long as there is another item in games to iterate through
		while(myIterator.hasNext()) {
					
			// Because .next() advances the iterator, a temp variable is 
			// necessary to do operations such as getName()
			tempTeam = myIterator.next();
					
			if(name.equals(tempTeam.getName())) {
				// The team already exists
				System.out.println("The team already exists");
				// return the existing game instance to the caller
				return tempTeam;
			}
					
		}

		// If not found, make a new game instance and add to list of games
		// These lines of code do not need an if statement because they will 
		// only execute if a match is not found 
		tempTeam = new Team(-1, name);
		teams.add(tempTeam);

		// return the new game instance to the caller
		return tempTeam;
	}
	
	
	/**
	 * print all teams in game
	 * for testing
	 */
	public void printTeams() {
		// local Team instance
		Team tempTeam = null;
		
		// Creates an Iterator that will go through the variable games
		Iterator<Team> myIterator = teams.iterator();
				
		// This loop will execute as long as there is another item in games to iterate through
		while(myIterator.hasNext()) {
					
			// Because .next() advances the iterator, a temp variable is 
			// necessary to do operations such as getName()
			tempTeam = myIterator.next();
			System.out.println(tempTeam.toString());
		}
	}
	
	
	@Override
	public String toString() {
		
		return "Game [id=" + this.getId() + ", name=" + this.getName() + "]";
	}

}
