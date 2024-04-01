package javapr.interviewprograms;
//generate a Fibonacci series
public class pro16 {
    public static void main(String[] args) {
        //fibonacci series means it will start from 0 and 1 and and third number is addition of 
        //last two numbers
        int num=10;
        int t1=0;
        int t2=1;
        for(int i=1;i<=num;i++){
            System.out.println(t1);
            int sum=t1+t2;//0+1=1,1+1=2,1+2=3,
            t1=t2;//t1=1,1,2,
            t2=sum;//t2=1,2,3,
        }
    }
    
}
