package org.pok.g2g.domain;

import java.util.UUID;

import org.pok.g2g.helpers.JsonString;
import org.pok.g2g.persistence.StorageFacade;

/**
 * A class that is to keep track of a journeys origin and destination, the stops it 
 * may have in different locations. Also holds information about the amount of passengers
 * and a description of the journey.
 * @author Kristofer
 *
 */
public class Journey {
	
	private Location origin;
	private Location destination;
	private int amountOfPassengers;
	private String description;
	private UUID journeyId;
	
	final private String UUID_MIN = "00000000-0000-0000-0000-000000000000";
	
	public Journey(){
		journeyId = UUID.fromString(UUID_MIN);
	}
	
	public void setOrigin(Location startLocation){
		this.origin = startLocation;
	}
	
	public void setDestination(Location destination){
		this.destination = destination;
	}
	
	public void setAmountOfPassengers(int amount){
		this.amountOfPassengers = amount;
	}
	
	public void setDescription(String desc){
		this.description = desc;
	}
	
	public void setJId(UUID id){
		this.journeyId = id;
	}
	
	public int getAmountOfPassengers(){
		return amountOfPassengers;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String getOrigin(){
		return origin.getGeoData();
	}
	
	public String getDestination(){
		return destination.getGeoData();
	}
	
	public UUID getJID(){
		return journeyId;
	}
	
	public boolean saveJourney(){
		System.out.println("sparar");
		StorageFacade sf = new StorageFacade();
		
		if (journeyId.toString().equals(UUID_MIN))
			journeyId = UUID.randomUUID();
		
		return sf.saveJourney(this) == 1;
	}
	
	public JsonString toJson() {
		JsonString retVal = new JsonString();
		
		retVal.add("Origin", origin.getGeoData());
		retVal.add("Id", journeyId.toString());
		retVal.add("Destination", destination.getGeoData());
		retVal.add("Description", description);
		retVal.add("AmountOfPassengers", amountOfPassengers);
		
		return retVal;
	}

}

