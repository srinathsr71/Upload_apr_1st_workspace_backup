package interview_programs;

import java.util.Scanner;

public class pro1 {
	public static void main(String args[]) {
	int year=2012;
	boolean flag;
	if(year %4==0) {
		if(year %100==0) {
			if(year %400==0) {
				flag=true;
			}else {
				flag=false;
			}
		}else {
			flag=true;
		}
	}else {
		flag=false;
	}
	
	if(flag) {
		System.out.println("the given year is leap year");
	}else {
		System.out.println("the given year is not leap year");
	}
	
	

	
				
		
	}

}
