package javapr.interviewprograms;
//check whethter the number is palindrome or not
public class pro21 {
    public static void main(String[] args) {
        int num=123;
        int rev=0;
        int actualn=num;
        while(num !=0){
            int j=num%10;
            rev=rev*10+j;
            num=num/10;
        }
        if(actualn==num){
            System.out.println(actualn+"is a palindrome");
        }else{
            System.out.println(actualn+"is not a palindrome");
        }
        
    }
    
}
