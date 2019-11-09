package com.murali.krishna;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InterfaceWithMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[] = {1,2,3,4,5};
		
		List<Integer> list = Arrays.asList(arr);
		
		 for (Integer i : list)
		 {
			 System.out.println(i);
		 }
		 
		 list.add(6);
		 

	}

}
