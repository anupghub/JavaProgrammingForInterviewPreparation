package com.ice.apiAutomation;

public class A implements TestAbstraction{

	public static void main(String[] args) {
		A a1 = new A();
		a1.carColor();
		a1.carModel();
		

	}

	@Override
	public void carModel() {
		System.out.println("235");
		
	}

	@Override
	public void carColor() {
		System.out.println("Black");
		
	}

}
