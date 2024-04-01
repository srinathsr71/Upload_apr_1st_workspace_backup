
import java.util.Random;
import java.util.Scanner;

public class example3 {

    public static void main(String[] args) {
        System.out.println("Enter the maximum number");
        Scanner st=new Scanner(System.in);
        int ma=st.nextInt();
        System.out.println("Enter the minimum number");
        Scanner str=new Scanner(System.in);
        int mi=str.nextInt();
        // final int maxNumber = 49;
        // final int totalNumbers = 6;
        Random random = new Random();
        boolean[] alreadySelected = new boolean[ma + 1];
        int count = 0;

        while (count < mi) {
            int randomNumber = random.nextInt(ma) + 1;
            if (!alreadySelected[randomNumber]) {
                alreadySelected[randomNumber] = true;
                count++;
                System.out.print(randomNumber + " ");
            }
        }
    }
}

