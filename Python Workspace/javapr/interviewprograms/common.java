package com.interviewprograms;

import java.util.ArrayList;
import java.util.List;
//write a java program to find common elements between two arraylist.
public class common {
	
	
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l2.add(4);
		l2.add(1);
		l2.add(2);
		for(int i=0;i<l1.size()-1;i++) {
			if(l2.contains(l1.get(i))) {
				System.out.println(l1.get(i));
			}
		}

		
	}

}
