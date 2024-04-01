package javapr.interviewprograms;
//find the number of capital letters are available in a given string.
public  class pro33 {
    public static void main(String[] args) {
        String lk="NaveenKumarLabsCodingtesting";
        int count=0;
        int count1=0;
        for(int i=0;i<lk.length();i++){
            if(lk.charAt(i)>='A'&& lk.charAt(i)<='Z'){
                count++;
            }
            if(lk.charAt(i)>='a'&& lk.charAt(i)<='z'){
                count1++;
            }
        }
        System.out.println(count);
        System.out.println(count1);
    }
    
}