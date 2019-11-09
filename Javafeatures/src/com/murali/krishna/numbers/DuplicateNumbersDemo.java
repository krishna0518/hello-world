package com.murali.krishna.numbers;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {12,15,12,18,16,14,11,13,15,16,18};
		
		/*
		 * for (int i = 0; i < num.length; i++) {
		 * 
		 * for (int j = i+1; j < num.length; j++) {
		 * 
		 * if(num[i]==num[j]) { System.out.println("Duplicate Number :"+ num[i]); }
		 * 
		 * }
		 * 
		 * }
		 */
		
		Set<Integer> set = new HashSet<>();
		for (Integer integer : num) {
			
			if(!set.add(integer))
			{
				System.out.println("Duplicate Number :"+ integer);
			}
			
		}
	}

}
