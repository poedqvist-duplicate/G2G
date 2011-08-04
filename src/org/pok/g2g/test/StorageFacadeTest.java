/**
 * 
 */
package org.pok.g2g.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import org.pok.g2g.domain.Traveller;

import org.junit.Test;

import org.pok.g2g.persistence.StorageFacade;

/**
 * @author Kristofer
 *
 */
public class StorageFacadeTest {

	@Test
	public void saveTravellerToDb() {
		Traveller t1 = new Traveller();
		t1.setAge(23);
		t1.setName("Kristofer");
		t1.setPhoneNumber("032110622");
		t1.setId(UUID.randomUUID());
		assertTrue(t1.saveTraveller());
	}
	
	@Test
	public void searchTraveller(){
		StorageFacade sf1 = new StorageFacade();
		
		ArrayList<Traveller> travellers;
		
		travellers = sf1.getTravellersByName("Kristofer");
		//sf1.getTravellersByAge(24);
		//sf1.getTravellersByPhone("032110622");
		
		assertTrue(travellers.size() > 0);
		assertEquals("Kristofer", travellers.get(0).getName());
		
		travellers.clear();
		assertTrue(travellers.size() == 0);
		int age = 23;
		travellers = sf1.getTravellersByAge(age);
		assertTrue(travellers.size() > 0);
		assertEquals(age, travellers.get(0).getAge());
		
		travellers.clear();
		assertTrue(travellers.size() == 0);
		String phone = "032110622";
		travellers = sf1.getTravellersByPhone(phone);
		assertTrue(travellers.size() > 0);
		assertEquals("032110622", travellers.get(0).getPhone());
	}

}
