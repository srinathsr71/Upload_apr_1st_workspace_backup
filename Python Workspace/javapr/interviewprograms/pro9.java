package javapr.interviewprograms;
//find the largest number among given numbers
public class pro9 {
    public static void main(String[] args) {
        int a=50;
        int b=40;
        int c=20;
        if(a>b && a>c)
        {
            System.out.println("a is the greatest number");
        }else if (b>c) 
        {
         System.out.println("b is the greatest number");   
        }else{
            System.out.println("c is the greatest number");
        }

        
        if(a>=b){
            if(a>=c){
                System.out.println("a is greatest number");
            }else{
                System.out.println("b is greatest number");
            }
        }else{
            if(b>=c){
                System.out.println("a is greatest number");
            }else{
                System.out.println("c is greatest number");
            }
        }

    }
    
}
