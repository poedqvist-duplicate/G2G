package org.pok.g2g.domain;

/**
 * 
 */

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

import org.pok.g2g.helpers.JsonString;
import org.pok.g2g.persistence.StorageFacade;

/**
 * A class that is responsible for storing information about a person
 * that wants to register a journey or participate in someone elses
 * journey.
 * @author Kristofer
 *
 */
public class Traveller {
	
	private String name;
	private String phoneNumber;
	private int age;
	private UUID id;
	private ArrayList<Journey> journeys = new ArrayList<Journey>();	
	
	final private String UUID_MIN = "00000000-0000-0000-0000-000000000000";
	
	public Traveller(){
		id = UUID.fromString(UUID_MIN);
	}
	
	public String getName(){
		return name;
	}
	
	public UUID getId(){
		return id;
	}
	
	public String getPhone(){
		return phoneNumber;
	}
	
	public int getAge(){
		return age;
	}
	
	public void addJourney(Journey journey){
		journeys.add(journey);
	}
	
	public void removeJourney(Journey journey){
		journeys.remove(journey);
	}
	
	public ArrayList<Journey> getAllJourneys(){
		return journeys;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setId(UUID id){
		this.id = id;
	}
	
	public boolean saveTraveller(){
		StorageFacade sf = new StorageFacade();
		
		if (id.toString().equals(UUID_MIN))
			id = UUID.randomUUID();
		
		return sf.saveTraveller(this) == 1;
	}

	
	public JsonString toJson() {
		JsonString retVal = new JsonString();
		
		retVal.add("Name", name);
		retVal.add("Id", id.toString());
		retVal.add("PhoneNumber", phoneNumber);
		retVal.add("Age", age);
		
		return retVal;
	}
}
