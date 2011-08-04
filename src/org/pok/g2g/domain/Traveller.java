package org.pok.g2g.domain;

/**
 * 
 */

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

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
	private String password;
	private ArrayList<Journey> journeys = new ArrayList<Journey>();	
	
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
		return sf.saveTraveller(this) == 1;
	}

}
