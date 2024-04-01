package javapr.interviewprograms;

import java.util.BitSet;

//print 1 to 100 with out using any loop and recursion
public class pro34 {

    public static void main(String[] args) {
        //1.bitset
        String set=new BitSet() {{set(1,100);}}.toString();
        System.out.append(set,1,set.length());
    }
    
}
