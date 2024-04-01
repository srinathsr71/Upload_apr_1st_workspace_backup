 package javapr.interviewprograms;
//count the occurrences of a chracter string
 public class pro30 {

    public static void main(String[] args) {
           String e="javacoding learning";
           int count=0;
           for(char ch:e.toCharArray())
           {
            if(ch == 'a'){
                count++;
            }
           } 
           System.out.println(count);




    }
}