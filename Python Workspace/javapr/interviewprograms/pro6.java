package javapr.interviewprograms;
//swaping two numbers
public class pro6 {
    public static void main(String[] args) {
        //using third variable
    //     int a=10;
    //     int b=40;
    //     System.out.println("before swaping");
    //     System.out.println("a="+a);
    //     System.out.println("b="+b);
    //     System.out.println("After swaping");
    //     int temp;
    //    temp=a;
    //    a=b;
    //    b=temp;
    //    System.out.println("a="+a);
    //     System.out.println("b="+b);
    

    //with out using third variable
        int a=10;
        int b=40;
        System.out.println("before swaping");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("After swaping");
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("a="+a);
        System.out.println("b="+b);



    }
    
}
