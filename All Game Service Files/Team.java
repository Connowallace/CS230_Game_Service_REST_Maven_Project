package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author Connor Wallace
 *
 */
public class Team extends Entity{
	
	private List<Player> players = new ArrayList<Player>();
	
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Team() {
		
	}
	
	
	/**
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		this();
		this.setId(id);
		this.setName(name);
	}

	
	/**
	 * Add a team to the team list if it does not already exist
	 */
	public Player addPlayer(String name) {
		// Local Player instance
		Player tempPlayer = null;
		
		// Creates an Iterator that will go through the variable games
		Iterator<Player> myIterator = players.iterator();
				
		// This loop will execute as long as there is another item in games to iterate through
		while(myIterator.hasNext()) {
					
			// Because .next() advances the iterator, a temp variable is 
			// necessary to do operations such as getName()
			tempPlayer = myIterator.next();
					
			if(name.equals(tempPlayer.getName())) {
				// The team already exists
				System.out.println("The player already exists");
				// Return the existing Player instance to the caller
				return tempPlayer;
			}
					
		}

		// If not found, make a new game instance and add to list of games
		// These lines of code do not need an if statement because they will 
		// only execute if a match is not found 
		tempPlayer = new Player(-1, name);
		players.add(tempPlayer);

		// Return the new game instance to the caller
		return tempPlayer;
	}
	
	
	/**
	 * print all teams in game
	 * for testing
	 */
	public void printPlayers() {
		// Local Team instance
		Player tempPlayer = null;
		
		// Creates an Iterator that will go through the variable games
		Iterator<Player> myIterator = players.iterator();
				
		// This loop will execute as long as there is another item in games to iterate through
		while(myIterator.hasNext()) {
					
			// Because .next() advances the iterator, a temp variable is 
			// necessary to do operations such as getName()
			tempPlayer = myIterator.next();
			System.out.println(tempPlayer.toString());
		}
	}
	
	@Override
	public String toString() {
		return "Team [id=" + this.getId() + ", name=" + this.getName() + "]";
	}
}
