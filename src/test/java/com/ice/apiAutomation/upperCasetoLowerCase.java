package com.ice.apiAutomation;

public class upperCasetoLowerCase {

	public static void main(String[] args) {
		upperCasetoLowerCase a1 = new upperCasetoLowerCase();
		a1.test();

	}

	public void test() {
		
		StringBuffer Name = new StringBuffer("AnupKUmar");
		
		for(int i=0; i<Name.length(); i++) {
			
			Character ch = Name.charAt(i);
			
			if(Character.isLowerCase(ch)) {
				
				Name.setCharAt(i,Character.toUpperCase(ch));
			}else {
				Name.setCharAt(i,Character.toLowerCase(ch));
			}
		}
		System.out.println(Name);
    }

}