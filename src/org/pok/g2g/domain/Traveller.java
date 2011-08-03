package org.pok.g2g.domain;

/**
 * 
 */

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

import org.pok.g2g.persistence.StorageFacade;

/**
 * @author Kristofer
 *
 */
public class Traveller {
	
	private String name;
	private String phoneNumber;
	private int age;
	private UUID id;
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
	
	/*
    public int addTraveller(Traveller trav){
		int retVal = -1;
		if (isConnected()){
		    String sqlString = String.format(
			"INSERT INTO \"Travellers\" VALUES ('%s', '%s', '%s', %d);",
			trav.getName(), trav.getId(), trav.getPhone(), trav.getAge());
		    retVal = executeUpdate(sqlString);
		}
		return retVal;
    }
    
    
    //Get...
    public Traveller getTraveller(UUID id){
    	Traveller retTrav = null;
		if (isConnected()){
		    String query = "SELECT * FROM \"Travellers\" WHERE " +
		    		   "Id = '" + id +
		    		   "' ORDER BY Id;";
		    ResultSet travellerSet = executeSQL(query);
		    if ( travellerSet == null )
		    	System.out.println("DEBUGG ME->NULL @ getCustomer!");
		    try{
		            while(travellerSet.next()){
		        	retTrav = new Traveller(
		        			travellerSet.getString(1),	//Name
		        			travellerSet.getString(2),	//Id
		        			travellerSet.getString(3),	//Phone
		        			travellerSet.getString(4));	//Age
		            }
		            travellerSet.close();
		        }catch (SQLException se){
		            System.out.println("Exception while getting bookSet: " +
		        	    "shouldnt happend: We've done something bad.");
		            se.printStackTrace();
		            System.out.println(se.getMessage());
		        } 
		}
		return retTrav;
    }
    */

}
