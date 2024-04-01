package javapr.interviewprograms;
//find the length with out using length method
public class pro32 {
    public static void main(String[] args) {
        String s="coding";
        //System.out.println(s.toCharArray().length);
        //System.out.println(s.split("").length);
        int count=0;
        for(char c:s.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
