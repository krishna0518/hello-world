package com.murali.krishna;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=5;i++ )
		{
			for(int j=0;j<=5;j++)
			{
				if(5-j<=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
