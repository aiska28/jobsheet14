import java.util.Scanner;

public class ProvitRecursive04 {
    static double calculateProfit(double balance, int period){
        if (period==0) {
            return balance;
        } else {
            return 1.11*calculateProfit(balance, period-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Balance: ");
        double initialBalance = input.nextDouble();
        System.out.print("Input Investment Period: ");
        int Investment = input.nextInt();

        System.out.println("Balance after "+initialBalance+" year = "+
                            calculateProfit(initialBalance, Investment));
    }
}