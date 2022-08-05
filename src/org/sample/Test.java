package org.sample;

public class Test {
	 static int id =10;
	private void m1() {
		// TODO Auto-generated method stub
		 int id=100;
		System.out.println(id);
		

	}
	private void m3() {
		// TODO Auto-generated method stub
System.out.println(id);
	}
	public static void main(String []args) {
		Test a = new Test ();
		
		a.m1();
		a.m3();
	}

}
