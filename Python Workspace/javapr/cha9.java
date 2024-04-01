import java.util.Scanner;

public class cha9 {
    
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter first number");
int a=in.nextInt();
System.out.println("Enter second number");
int b=in.nextInt();
System.out.println("Enter operator + - * / ");
char op=in.next().charAt(0);
switch(op){
case('+'):
System.out.println("Result = "+(a+b));
break;
case('-'):
System.out.println("Result = "+(a-b));
break;
case('*'):
System.out.println("Result = "+(a*b));
break;
case('/'):{
if(b!=0) {
System.out.println("Result = "+(a/b));
}
else {
System.out.println("Error : Div by zero is not possible");
}
}
System.out.println("Result = "+(a/b));
break;
default:
System.out.println("Invalid op");
}
}
}