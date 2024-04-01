package javapr.interviewprograms;
//count the number of digits in an integer
public class pro18 {
    public static void main(String[] args) {
        int gh=12345566;
        int count=0;
        while(gh!=0){
            gh=gh/10;//1234556,123455,12345,1234,123,12,1,0
            ++count;
        }
        System.out.println(count);
    }
    
}
