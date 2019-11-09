package com.murali.krishna;

interface LambdaI
{
	void show(int i);
	
}

/*
 * class LambdaC implements LambdaI {
 * 
 * @Override public void show() { // TODO Auto-generated method stub
 * 
 * System.out.println("hello");
 * 
 * }
 * 
 * }
 */
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LambdaI l = new LambdaC();
		LambdaI l = (i)-> System.out.println("hello " + i);
		l.show(8);
	}

}
