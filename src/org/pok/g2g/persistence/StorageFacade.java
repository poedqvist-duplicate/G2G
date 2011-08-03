package org.pok.g2g.persistence;

import java.sql.*;
import java.util.ArrayList;
import java.util.UUID;

import org.pok.g2g.domain.Traveller;

/**
 * A class that acts as a facade between the model layer and the storage layer.
 * @author Kristofer
 *
 */
public class StorageFacade {
	
	public int saveTraveller(Traveller travellerToBeSaved) {
		
		DatabaseConnection dc1 = new DatabaseConnection();
		dc1.connect();
		
		String sqlString = String.format(
				"INSERT INTO \"Travellers\" VALUES ('%s', '%s', '%s', %d);",
				travellerToBeSaved.getName(), travellerToBeSaved.getId().toString(), 
					travellerToBeSaved.getPhone(), travellerToBeSaved.getAge());
	
		return dc1.executeUpdate(sqlString);
	}

	private ArrayList<Traveller> getTravellers(String where){
		
		DatabaseConnection dc1 = new DatabaseConnection();
		dc1.connect();
		ArrayList<Traveller> returnArray = null;
		String sqlString = ("SELECT * FROM \"Travellers\" WHERE " + where);
		
		ResultSet rs = dc1.executeSQL(sqlString);
		if(rs != null){
			try{
				returnArray = new ArrayList<Traveller>();
				while(rs.next()){
					Traveller t = new Traveller();
					t.setName(rs.getString("Name"));
					t.setId(UUID.fromString(rs.getString("Id")));
					t.setAge(Integer.parseInt(rs.getString("Age")));
					t.setPhoneNumber(rs.getString("Phone"));
					returnArray.add(t);
				}
			} catch (Exception e){
				System.out.println("Shit happens.." + e.getMessage());
			}
		} 
		return returnArray;
	}
	
	public ArrayList<Traveller> getTravellersByName(String name) {
		return getTravellers("\"Name\" like '" + name + "'");
	}

	public ArrayList<Traveller> getTravellersByAge(int age) {
		return getTravellers("\"Age\" = " + age);
	}

	public ArrayList<Traveller> getTravellersByPhone(String phone) {
		return getTravellers("\"Phone\" like '" + phone + "'");
	}

}

