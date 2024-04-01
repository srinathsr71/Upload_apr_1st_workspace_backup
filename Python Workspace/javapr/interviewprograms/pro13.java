package javapr.interviewprograms;
//calculate sum of natural numbers
public class pro13 {
    public static void main(String[] args) {
        int nu=100;
        int sum=0;
        // for(int i=1;i<=nu;i++){
        //     sum=sum+i;//1+2+3+
        // }
        // System.out.println("sum is:"+sum);
        int k=1;
        while(k<=nu){
            sum=sum+k;
            k++;
        }
        System.out.println("sum is:"+sum);
    }
    
}
