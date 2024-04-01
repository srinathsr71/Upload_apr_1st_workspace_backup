package javapr.interviewprograms;

import java.util.Scanner;

//simple calculator with the help of switch case.
public class pro26 {
    public static void main(String[] args) {
        Scanner sj=new Scanner(System.in);
        System.out.println("enter two numbers:");
        double d=sj.nextDouble();
        double s=sj.nextDouble();
        System.out.println("Enter the operator:(+,-,*,/):");
        char op=sj.next().charAt(0);
        double re=0;
        switch (op) {
            case '+':
                re=d+s;
                break;
            case '-':
                re=d-s;
                break;
            case'*':
                re=d*s;
                break;
            case '/':
                re=d/s;
                break;
                
            default:
                System.out.println("please pass the correct operator");
                break;
        }
        System.out.println(re);
    }
    
}
