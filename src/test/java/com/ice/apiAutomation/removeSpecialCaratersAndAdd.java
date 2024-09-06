package com.ice.apiAutomation;

import java.util.ArrayList;

public class removeSpecialCaratersAndAdd {

	public static void main(String[] args) {
		removeSpecialCaratersAndAdd a1 = new removeSpecialCaratersAndAdd();
		a1.test();
	}
	
	public void test() {
		
		String value = "Anup1234%$55#6789";
		String intValue = value.replaceAll("[^0-9]", ""); 
		System.out.println(intValue);
	    int temp = 0;
		
		char[] new_Value = intValue.toCharArray();
		for(int i=0; i<new_Value.length; i++) {
			
			 temp = temp + Integer.parseInt(String.valueOf(new_Value[i]));
			
		}
	System.out.println(temp);	
		
	}

}
