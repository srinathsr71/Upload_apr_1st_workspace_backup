package javapr.interviewprograms;
//display prime number between two intervals or display prime numbers 1 to 20
public class pro23 {
    public static void main(String[] args) {
        int high=40;
        int low=20;
        while(low<high){
            boolean f=false;
            for(int i=2;i<=low/2;i++){
                if(low%i==0){
                    f=true;
                }
            }
            if(!f){
                System.out.println(low+" ");
            }
            low++;
        }
    }    
}
