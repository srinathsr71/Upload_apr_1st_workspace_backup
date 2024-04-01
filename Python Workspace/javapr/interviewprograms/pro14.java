package javapr.interviewprograms;
//find the factorial of given number
public class pro14 {
    public static void main(String[] args) {
        int f=5;
        int fac=1;
        // for(int i=1;i<=f;i++){
        //     fac=fac*i;
        // }
        // System.out.println("the factorial of"+f+"is "  + fac);
        int j=1;
        while(j<=f){
            fac=fac*j;
            j++;
        }
        System.out.println("the factorial of"+f+"is"+fac);
    }

}
