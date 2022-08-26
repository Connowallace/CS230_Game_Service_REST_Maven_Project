package com.gamingroom;

/**
 * A base class to establish basic behaviour for all objects
 * 
 * @author Connor Wallace
 *
 */
public class Entity {

	private long id;
	private String name;
	
	/**
	 * Default constructor
	 * 
	 */
	protected Entity(){
	}
	
	/**
	 * Constructor with an identifier and name
	 */
	public Entity(long id, String name) {
		this();
		this.setId(id);
		this.setName(name);
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * set the id
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * set the name
	 */
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
}
