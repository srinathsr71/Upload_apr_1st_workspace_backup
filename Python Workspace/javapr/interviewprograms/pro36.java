package javapr.interviewprograms;
//print 10 times of given string
public class pro36 {
    public static void main(String[] args) {
        String n="srinath";
        String sr="i";
        sr=sr.replaceAll("i","iiiiiiiiii");
        sr=sr.replaceAll("i",n+"\n");
        System.out.println(sr);
    }
    
}
