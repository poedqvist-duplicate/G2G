/**
 * 
 */
package org.pok.g2g.domain;

/**
 * A class that is responsible for recieving system operation messages from the UI layer.
 * @author Kristofer
 *
 */
public class DomainRegister {

	public void registerTraveller(String name, String phoneNumber, int age){
		System.out.println("startregistertraveller");
		Traveller travellerToBeRegistered = new Traveller();
		travellerToBeRegistered.setName(name);
		travellerToBeRegistered.setPhoneNumber(phoneNumber);
		travellerToBeRegistered.setAge(age);
		System.out.println("beforesave");
		travellerToBeRegistered.saveTraveller();
	}
	
	public void registerJourney(){
		
	}
}
