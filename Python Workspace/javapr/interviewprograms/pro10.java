package javapr.interviewprograms;
//check the leap year
public class pro10 {
    public static void main(String[] args) {
        //year which is divisible by 4 and all the century year ending with --00
        //centuary year is a leap year only its perfect divisible by 400
        int year=2000;
        boolean flag=false;
        if(year %4 == 0)//the year is divisible by 4
        {
            if(year %100==0)//the century year ending with 00 or not
            {
                if(year %400==0)//checking the year is leap year or not
                {
                    flag=true;
                }else{
                    flag=false;
                }
            }else{
                flag=true;
            }
        }else{
            flag=false;
        }
        if(flag){
            System.out.println(year+"is a leap year");
        }else{
            System.out.println(year+"is not a leap year");
        }

    }
    
}
