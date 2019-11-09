package com.murali.krishna;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		/*
		 * list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6);
		 */		
		list.add(null);
		list.forEach(i-> System.out.println(i));
		

	}

}
