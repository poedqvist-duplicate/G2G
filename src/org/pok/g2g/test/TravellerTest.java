/**
 * 
 */
package org.pok.g2g.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.pok.g2g.domain.Journey;
import org.pok.g2g.domain.Location;
import org.pok.g2g.domain.Traveller;

import org.junit.Test;

/**
 * @author P-O Edqvist
 *
 */
public class TravellerTest {

	@Test
	public void travellerKnowsItsAttributes() {
		
		Traveller p1 = new Traveller();
		p1.setName("Testperson");
		p1.setPhoneNumber("032110622");
		p1.setAge(23);
		
		assertFalse(p1.getPhone().equals("032110621"));
		
		assertEquals("Testperson", p1.getName());
		assertEquals("032110622", p1.getPhone());
		assertEquals(23, p1.getAge());
	}
	
	@Test
	public void travellerKnowsItsJourneys(){
		
		//Creates traveller with attributes
		Traveller p1 = new Traveller();
		p1.setName("Testperson");
		p1.setPhoneNumber("032110622");
		p1.setAge(23);
		
		//Creates two cities
		Location t1 = new Location(78.1, 10.5, 5.0);
		Location t2 = new Location(45.1, 2.5, 1.0);
		
		//Creates two journeys that are to be added to p1's Journey[]
		Journey j = new Journey();
		Journey j2 = new Journey();
		
		j.setOrigin(t1);
		j.setDestination(t2);
		j2.setOrigin(t2);
		j2.setDestination(t1);
		//Adds journey
		p1.addJourney(j);
		p1.addJourney(j2);
		
		//Creates temporary arraylist to receive p1's array
		ArrayList<Journey> testArr = p1.getAllJourneys();
		
		//Checks if first elemts has the correct end- and startcities
		assertEquals("78.1" + " " + "10.5" + " " + "5.0", testArr.get(0).getOrigin());
		assertEquals("45.1" + " " + "2.5" + " " + "1.0", testArr.get(0).getDestination());
		
	}
	

}

