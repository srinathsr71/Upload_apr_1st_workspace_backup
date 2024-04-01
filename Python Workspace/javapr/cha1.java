import java.util.Scanner;

public class cha1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the addition of  number");
        int d=sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(+d+"*"+i+"="+(d*i));
        // }
        for(int i=1;i<=10;i++){
            System.out.println(+d+"+"+i+"="+(d+i));
        }
    }
    
}
