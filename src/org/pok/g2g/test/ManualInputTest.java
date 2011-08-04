/**
 * 
 */
package org.pok.g2g.test;

import java.util.Scanner;
import java.util.UUID;

import org.pok.g2g.domain.Traveller;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Kristofer
 *
 */
public class ManualInputTest {
	
	@Test
	public void addTravellerByConsole(){
		Scanner sc1 = new Scanner(System.in);
		Traveller t1 = new Traveller();
		
		String t1Name, t1Phone;
		int t1Age;
		
		System.out.println("Enter name: ");
		t1Name = sc1.next();
		t1.setName(t1Name);
		System.out.println("Enter age: ");
		t1Age = sc1.nextInt();
		t1.setAge(t1Age);
		System.out.println("Enter phone: ");
		t1Phone = sc1.next();
		t1.setPhoneNumber(t1Phone);
		t1.setId(UUID.randomUUID());
		t1.saveTraveller();
		
		assertTrue(t1Name.equals(t1.getName()));
		assertTrue(t1Age == t1.getAge());
		assertTrue(t1Phone.equals(t1.getPhone()));
	}

}
