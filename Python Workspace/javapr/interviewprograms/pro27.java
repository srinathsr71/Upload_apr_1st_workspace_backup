package javapr.interviewprograms;
//Find the natural number using recursion
public class pro27 {
    public static void main(String[] args) {
        //recursion is method calling itself
        int num=5;
        int sum=add(num);
        System.out.println("sum is:"+sum);

    }


  public static int add(int num){
    if(num!=0){
        return num+add(num-1);
    }else{
        return num;
    }
  }  
}
