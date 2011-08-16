package org.pok.g2g.helpers;

import java.util.Map;

/**
 * This class is meant to serve as a json-string-builder to help send
 * objects from server-side to client-side
 * 
 * @author P-O
 *
 * How2Improve:
 * x Add support for arrays
 * x Add support for extracting information from a JsonString
 * x Add support for removing objects
 */
public class JsonString {
	protected String json = "";
	
	public JsonString(){
	
	}
	
	public void add(String key, String value){
		if (json.length() != 0)
			json += ",";
		
		json += String.format("\"%s\":\"%s\"",key,value);
	}
	
	public void add(String key, int value){
		if (json.length() != 0)
			json += ",";
		
		json += String.format("\"%s\":%d",key,value);
	}

	public void add(String key, JsonString value){
		if (json.length() != 0)
			json += ",";
		System.out.println("json, before:" + json);
		json += String.format("\"%s\":%s",key,value);
		System.out.println("json, after:" + json);
	}
	
	@Override
	public String toString(){
		return "{" + json + "}";
	}
}
