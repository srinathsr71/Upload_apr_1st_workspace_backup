package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicatesarraylist {
public static void main(String args[]) {
	ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,4,5,3,21,3,4,7));
	System.out.println("arraylist with duplicate elements:" + numbers);
	Set<Integer> set=new LinkedHashSet<>();
	set.addAll(numbers);
	numbers.clear();
	numbers.addAll(set);
	System.out.println("arraylist with out duplicate elements:" + numbers);
	}
}
