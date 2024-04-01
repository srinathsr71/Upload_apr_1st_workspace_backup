import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your savings goal: ");
        double savingsGoal = scanner.nextDouble();

        System.out.println("Enter your annual deposit: ");
        double annualDeposit = scanner.nextDouble();

        System.out.println("Enter the interest rate (percentage): ");
        double interestRate = scanner.nextDouble();

        int years = 0;
        double savingsAmount = 0;

        while (savingsAmount < savingsGoal) {
            savingsAmount += annualDeposit;
            double interest = savingsAmount * (interestRate / 100);
            savingsAmount += interest;
            years++;
        }

        System.out.println("Your retirment in " + years + " years to save $" + savingsGoal + " for retirement.");
    }
}