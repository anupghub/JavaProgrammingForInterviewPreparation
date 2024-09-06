package com.ice.apiAutomation;

public class SecondHighestNumber {

	public static void main(String[] args) {

		SecondHighestNumber a1 = new SecondHighestNumber();
		a1.test();
		
	}
	
	public void test() {
		
		int[] value = {5,3,2,7,9,1,8};
		
		int temp=0;
		for(int i=0; i<value.length; i++) {
			
			for(int j=i+1; j<value.length; j++) {
				
				if(value[i]> value[j]) {
					
					temp = value[i];
					value[i]= value[j];
					value[j]=temp;
										
				}
			}
		}
		System.out.println(value[value.length-2]);
	}

}
