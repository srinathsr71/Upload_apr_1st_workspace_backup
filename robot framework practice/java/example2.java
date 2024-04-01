import java.util.Scanner;

public class example2 {
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your name:");
       String name=sc.nextLine();

       System.out.println("Enter your age:");
       int age=sc.nextInt();

       System.out.println("Name:" +name);
       System.out.println("Age:" +age);
       if(age < 18){
        System.out.println("your not eligible for vote");
       }else{
        System.out.println("Your are eligible for vote");
       }
    }
    
}
