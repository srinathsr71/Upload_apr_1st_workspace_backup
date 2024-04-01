package javapr.interviewprograms;
//check whether the character is alphabet or not
public class pro12 {
    public static void main(String[] args) {
        char c='b';
        if((c >='a'&&c<='z')||(c>='A'&&c>='Z')){
            System.out.println(c+"is  an alphabet");
        }else{
            System.out.println(c+"is not an alphabet");
        }
        
    }
    
}
