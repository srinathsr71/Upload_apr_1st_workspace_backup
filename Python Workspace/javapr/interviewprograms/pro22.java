package javapr.interviewprograms;
//check whether the number is prime number or not
public class pro22 {
    public static void main(String[] args) {
        //prime number means which is only divisible by only 1 and itself.
        //2 is the lowest prime number
        int num=2;
        boolean flag=false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("number is prime number");
        }else{
            System.out.println("number is not a prime number");
        }
    }
    
}
