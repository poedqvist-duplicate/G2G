package org.pok.g2g.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.pok.g2g.helpers.JsonString;

public class JsonTests {
	
	@Test
	public void testJSON(){
		JsonString str = new JsonString();
		str.add("FirstName", "Kalle");
		str.add("LastName", "Anka");
		
		assertEquals("{\"FirstName\":\"Kalle\",\"LastName\":\"Anka\"}",str.toString());
	}
	
	@Test
	public void testJSONWithDigits(){
		JsonString str = new JsonString();
		str.add("String", "Value");
		str.add("Integer", 1);
		
		assertEquals("{\"String\":\"Value\",\"Integer\":1}",str.toString());
	}
	
	@Test
	public void testJSONNested(){
		JsonString str = new JsonString();
		JsonString nested = new JsonString();
		
		str.add("String", "Value");
		
		nested.add("FirstIs", "Simple");
		nested.add("InnerObject", str);
		
		assertEquals("{\"FirstIs\":\"Simple\",\"InnerObject\":{\"String\":\"Value\"}}",nested.toString());
	}
}
