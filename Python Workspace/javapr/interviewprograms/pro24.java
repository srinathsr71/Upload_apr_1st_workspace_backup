package javapr.interviewprograms;
//to check the given number is armstrong number or not
public class pro24 {
    public static void main(String[] args) {
        //it means
        //153=1*1*1+5*5*5+3*3*=1+125+27=153
        //371=3*3*3+7*7*7+1*1*1=27+343+1=371
        int num=371;
        double result=0;
        int actualnum=num;
        while(num !=0){
            int n=actualnum%10;
            result=result+Math.pow(n,3);
            actualnum=actualnum/10;
        }     
        if(result==num){
            System.out.println(num+"is a armstrong number");
        }else{
            System.out.println(num+"is not an armstrong number");
        }
    }
    
}
