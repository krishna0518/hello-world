package com.murali.krishna;

import java.util.HashMap;
import java.util.Map;

public class CharCountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "application";
		String[] str_arr= new String[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			str_arr[i]= Character.toString(s.charAt(i));
		}
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for(String ss : str_arr)
		{
			int count=1;
			
			if(map.containsKey(ss))
			{
				count=map.get(ss);
				count++;
				map.put(ss, count);
			}
			else
				map.put(ss, count);
			
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
	}

}
