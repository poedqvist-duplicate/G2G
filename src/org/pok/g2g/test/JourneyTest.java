/**
 * 
 */
package org.pok.g2g.test;

import static org.junit.Assert.*;

import org.pok.g2g.domain.Journey;
import org.pok.g2g.domain.Location;
import org.pok.g2g.domain.Traveller;

import org.junit.Test;

/**
 * @author P-O Edqvist
 *
 */
public class JourneyTest {
	@Test
	public void journeyKnowsItsAttributes() {
		
		//Creates cityobjects
		Location t1 = new Location(51.1, 5.5, 2.0);
		Location t2 = new Location(45.1, 2.5, 1.0);
		Location t3 = new Location(78.1, 10.5, 5.0);
		
		//Creates a new journey with a start- and endpoint
		Journey j = new Journey();
		j.setOrigin(t1);
		j.setDestination(t2);
		
		//Checks so that t2 isn't the starting point for the journey
		assertFalse(j.getOrigin().equals("45.1" + " " + "2.5" + " " + "1.0"));
		//Checks so that t1 is the starting point for the journey
		assertEquals("51.1" + " " + "5.5" + " " + "2.0", j.getOrigin());
		//Checks so that stockholm is the enddestination
		assertEquals("45.1" + " " + "2.5" + " " + "1.0", j.getDestination());
		
		//Changes start and endcity
		j.setOrigin(t3);
		j.setDestination(t1);
		
		//Asserts that ulricehamn is the startcity and göteborg the endcity
		assertEquals("78.1" + " " + "10.5" + " " + "5.0", j.getOrigin());
		assertEquals("51.1" + " " + "5.5" + " " + "2.0", j.getDestination());
	}

}
