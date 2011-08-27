/**
 * 
 */
package org.pok.g2g.test;

import org.pok.g2g.persistence.DatabaseConnection;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Kristofer
 *
 */
public class DatabaseConnectionTest {
	
	@Test
	public void canConnectAndDisconnectDb(){
		DatabaseConnection dc1 = new DatabaseConnection();
		assertTrue(dc1.connect());
		assertTrue(dc1.isConnected());
	}
	
}
