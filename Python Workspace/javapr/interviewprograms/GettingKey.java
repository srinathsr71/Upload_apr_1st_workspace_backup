package com.interviewprograms;

import java.util.HashMap;
import java.util.Map;

//write a java program to fetch values from map using keys.
public class GettingKey {

	public static void main(String[] args) {
		Map<Character, Integer> m1=new HashMap<Character, Integer>();
		m1.put('c', 1);
		if(m1.containsKey('c')) {
		System.out.println(m1.get('c'));
		}
		}
}
