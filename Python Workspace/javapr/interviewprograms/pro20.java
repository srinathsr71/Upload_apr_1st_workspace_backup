package javapr.interviewprograms;
//calculate the power of number
public class pro20 {
    public static void main(String[] args) {
        int base=3;
        int exponent=4;
        long g=1;
        while(exponent!=0){
            g *=base;
            --exponent;
        }
        System.out.println(g);
    }
    
}
