import java.util.Scanner;

public class cha7 {

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter the total number of integers");
int n=in.nextInt();
int[] arr=new int[n];
int sum=0;
//System.out.println("Enter the numbers");
for(int i=0;i<n;i++){
arr[i]=in.nextInt();
sum=sum+arr[i];
}
double avg=sum/n;
System.out.printf("Average of numbers entered= %.2f\n", avg);
}
}
