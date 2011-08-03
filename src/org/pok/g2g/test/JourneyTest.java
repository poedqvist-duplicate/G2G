/**
 * 
 */
package org.pok.g2g.test;

import static org.junit.Assert.*;

import org.pok.g2g.domain.Journey;
import org.pok.g2g.domain.Traveller;
import org.pok.g2g.domain.City;

import org.junit.Test;

/**
 * @author P-O Edqvist
 *
 */
public class JourneyTest {
	@Test
	public void journeyKnowsItsAttributes() {
		
		//Creates cityobjects
		City t1 = new City("Göteborg");
		City t2 = new City("Stockholm");
		City t3 = new City("Ulricehamn");
		
		//Creates a new journey with a start- and endpoint
		Journey j = new Journey(t1, t2);
		
		//Checks so that stockholm isn't the starting point for the journey
		assertFalse(j.getStartCity().equals("Stockholm"));
		//Checks so that göteborg is the starting point for the journey
		assertEquals("Göteborg", j.getStartCity());
		//Checks so that stockholm is the enddestination
		assertEquals("Stockholm", j.getEndCity());
		
		//Changes start and endcity
		j.setStartCity(t3);
		j.setEndCity(t1);
		
		//Asserts that ulricehamn is the startcity and göteborg the endcity
		assertEquals("Ulricehamn", j.getStartCity());
		assertEquals("Göteborg", j.getEndCity());
	}

}
