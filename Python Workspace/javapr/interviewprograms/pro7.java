package javapr.interviewprograms;

import java.util.Scanner;

//check whether the number is even or odd
public class pro7 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("please enter a number");
        int u=i.nextInt();
        if(u%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
    }
    
}
