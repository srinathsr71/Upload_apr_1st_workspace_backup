package javapr.interviewprograms;
//factorial of given number using recursion
public class pro28 {
  public static void main(String[] args) {
    int num=5;
    int fac=fact(num);
    System.out.println("the factorial of given number is:"+fac);
  }  
  public static int fact(int num){
    if(num>=1){
        return num*fact(num-1);
    }else{
        return 1;
    }
  }
}
