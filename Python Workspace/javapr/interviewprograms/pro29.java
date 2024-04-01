package javapr.interviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//print duplicate characters from string
public class pro29 {
    public static void main(String[] args) {

        printduplicates("javaaaajfsdjdddfeanrjs");
    }

 public static void printduplicates(String s){
    char[] words=s.toCharArray();
    Map<Character,Integer> mk=new HashMap<Character,Integer>();
    for(Character sf:words){
        if(mk.containsKey(sf)){
            mk.put(sf,mk.get(sf)+1);
        }else{
            mk.put(sf,1);
        }
        Set<Map.Entry<Character,Integer>> eset=mk.entrySet();
        for(Map.Entry<Character,Integer> en:eset){
            if(en.getValue()>1){
                System.out.println(en.getKey()+":"+en.getValue());
            }
        }  
    }
 }   
}
