package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A singleton service for the game engine
 * 
 * @author Connor Wallace
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	
	/**
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	
	/**
	 * This static variable will be the only version of the game service
	 * ever created.
	 */
	private static GameService instance;
	
	
	/**
	 * Construct the game service
	 * 
	 * The constructor is private to ensure a GameService cannot be created out side of 
	 * the class GameService This control is necessary to retain only one instance of 
	 * the singleton GameService
	 */
	private GameService(){}
	

	/**
	 * Creates the first instance of GameService if it does not exist
	 * Returns the Singleton GameService
	 * This method is the accessor for the singleton GameService. 
	 * This allows other classes to use GameService without having access 
	 * to the constructor
	 * 
	 * @return the singleton instance of the game service
	 */
	public static GameService getInstance() {
		
		if (instance == null) {
			
			instance = new GameService();
			
		}
		
		return instance;
	}
	
	
	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// A local game instance
		Game game = null;

		// Creates an Iterator that will go through the variable games
		Iterator<Game> myIterator = games.iterator();
		
		// This loop will execute as long as there is another item in games to iterate through
		while(myIterator.hasNext()) {
			
			// Because .next() advances the iterator, a temp variable is 
			// necessary to do operations such as getName()
			game = myIterator.next();
			
			if(name == game.getName()) {
				System.out.println("game already exists");
				// Return the existing game instance to the caller
				return game;
			}
			
		}

		// If not found, make a new game instance and add to list of games
		// These lines of code do not need an if statement because they will 
		// only execute if a match is not found 
		game = new Game(nextGameId++, name);
		games.add(game);

		// return the new game instance to the caller
		return game;
	}

	
	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);  // This will throw an error if index is out of bounds
	}
	
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// A local game instance
		Game game = null;

		// Creates an Iterator that will go through the variable games
				Iterator<Game> myIterator = games.iterator();
				
				// This loop will execute as long as there is another item in games to iterate through
				while(myIterator.hasNext()) {
					
					// Because .next() advances the iterator, a temp variable is 
					// necessary to do operations
					game = myIterator.next();
					
					if(id == game.getId()) {
						// Return the existing game instance to the caller
						return game;
					}
				}
				
				// If a match is not found an error message is output and null is returned
				System.out.println("Game \"" + id + "\" not found");
				return null;
	}

	
	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// A local game instance
		Game game = null;
		
		// Creates an Iterator that will go through the variable games
		Iterator<Game> myIterator = games.iterator();
		
		// This loop will execute as long as there is another item in games to iterate through
		while(myIterator.hasNext()) {
			
			// Because .next() advances the iterator, a temp variable is 
			// necessary to do operations such as getName()
			game = myIterator.next();
			
			if(name == game.getName()) {
				// Return the existing game instance to the caller
				return game;
			}
		}
		
		// If a match is not found an error message is output and null is returned
		System.out.println("Game \"" + name + "\" not found");
		return null;
	}

	
	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}
