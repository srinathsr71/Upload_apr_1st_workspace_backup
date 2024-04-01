package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdescending {
	public static void main(String args[]) {
		ArrayList<Integer> arraylist=new ArrayList();
		arraylist.add(34);
		arraylist.add(8);
		arraylist.add(3);
		arraylist.add(45);
		arraylist.add(4);
		arraylist.add(75);
		System.out.println("Before sorting");
		for(int s: arraylist) {
			System.out.println(s);
		}
		Collections.sort(arraylist,Collections.reverseOrder());
		System.out.println("After sorting");
		for(int s: arraylist) {
			System.out.println(s);
		}
		System.out.println("Arraylist in descending order");
		for(int s: arraylist) {
			System.out.println(s);
		}
	}

}
