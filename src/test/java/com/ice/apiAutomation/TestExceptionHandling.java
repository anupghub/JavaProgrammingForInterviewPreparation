package com.ice.apiAutomation;

public class TestExceptionHandling {

	public static void main(String[] args) {
		TestExceptionHandling a1 = new TestExceptionHandling();
		System.out.println("Main");
		a1.test(10, 0);
	}
	
	public int test(int a, int b) {
		
		try {
			System.out.println("Trynew");
			int c=0;
			c=a/b;
			System.out.println("Exception thrown :"+c);
			System.out.println("Try");
			throw new ArithmeticException();

		}
		catch(Exception e ) {
			
			System.out.println("Arithmetic exception");
		}
		
		finally {
			System.out.println("Finally block sould get execute first");
		}
		return 0;
	}

}
