package com.ice.apiAutomation;

public class ReverseTheString {

	public static void main (String args[]) {
		
		ReverseTheString a1 = new ReverseTheString();
		a1.test();
	}
  
	public void test() {
	
	String value = "Ihaan Ivaan are very Intelligent";
	
	String[] new_Value = value.split(" ");
	
	String temp = " ";
	for(int i=0; i< new_Value.length; i++) {
		
		temp = " " + new_Value[i] + temp;
	}
	System.out.println(temp);
}
}