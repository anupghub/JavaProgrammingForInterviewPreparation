package com.ice.apiAutomation;

import java.util.HashMap;

public class OccurenceOfCharacter {

	public static void main(String[] args) {

		OccurenceOfCharacter a1 = new OccurenceOfCharacter();
		a1.test();
		
	}
	
	public void test() {
		
		String value = "IHAANIVAAN";
		char[] new_Value = value.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
	         for(int i=0; i<new_Value.length; i++) {
	        	 
	        	Integer integer =  map.get(new_Value[i]);
	        	
	        	if(integer == null) {	        		
	        		         map.put(new_Value[i], 1);
	        		         
	        	}else
	        		map.put(new_Value[i], integer+1);
	         }
	         
	         System.out.println(map);
	}
}
