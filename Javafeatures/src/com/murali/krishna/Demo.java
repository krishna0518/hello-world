package com.murali.krishna;

interface Iphone
{
	void call();
	default void message()
	{
		System.out.println("sent");
	}
	
}

class Android implements Iphone
{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("calling");
		
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone ph = new Android();
		ph.call();
		ph.message();

	}

}
