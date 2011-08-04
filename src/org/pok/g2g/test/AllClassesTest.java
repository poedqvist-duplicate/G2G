/**
 * 
 */
package org.pok.g2g.test;

import org.junit.Test;


/**
 * @author Kristofer
 *
 */
public class AllClassesTest {

	@Test
	public void testAllClasses(){
		/** Test cases so far:
		 * DatabaseConnectionTest
		 * JourneyTest
		 * StorageFacadeTest
		 * TravellerTest
		 */
		
		DatabaseConnectionTest dct1 = new DatabaseConnectionTest();
		dct1.canConnectAndDisconnectDb();
		
		JourneyTest jt1 = new JourneyTest();
		jt1.journeyKnowsItsAttributes();
		
		StorageFacadeTest sft1 = new StorageFacadeTest();
		sft1.saveTravellerToDb();
		sft1.searchTraveller();
		
		TravellerTest tt1 = new TravellerTest();
		tt1.travellerKnowsItsAttributes();
		tt1.travellerKnowsItsJourneys();
	}

}
