package javapr.interviewprograms;
//to reverse a number
public class pro19 {
    public static void main(String[] args) {
        int j=342111;
        int rev=0;
        while(j!=0){
            int n=j%10;//1,1,1,2,4,3//this is remainder
            rev=rev*10+n;//1,11,111,1112,1124,11243
            j=j/10;//34211,3421,342,34,3//this is qutioent
        }
        System.out.println("reversed number is:"+rev);
    }    
}
