package com.gamingroom;

/**
 * A simple class to hold information about a player
 * 
 * @author Connor Wallace
 *
 */
public class Player extends Entity {

	/**
	 * Constructor with an identifier and name
	 */
	public Player(long id, String name) {
		this.setId(id);
		this.setName(name);
	}


	@Override
	public String toString() {
		return "Player [id=" + this.getId() + ", name=" + this.getName() + "]";
	}
}
