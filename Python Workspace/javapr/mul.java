package javapr;
import java.util.Scanner;
public class mul {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to generate multiplication table");
        int n = in.nextInt();
        System.out.println("Multiplication table of "+n);
        System.out.println("--------------------------");
        multiply(n);
    }
}
    public static void multiply(int n){
        for (int i=1;i<=10;i++){
            System.out.println(+n+"*"+i+"="+(n*i));
        }
    }