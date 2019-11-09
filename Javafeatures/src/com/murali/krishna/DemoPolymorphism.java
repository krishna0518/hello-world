package com.murali.krishna;

class A {
	
	public void show()
	{
		System.out.println("A");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("B");
	}
}

public class DemoPolymorphism {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.show();

	}

}
