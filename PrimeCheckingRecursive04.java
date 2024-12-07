import java.util.Scanner;

public class PrimeCheckingRecursive04 {
    
    static int fillInThePrimeNumber (int n, int divisor) {
        if (n < 2) {
            return 0;
        } if (divisor == 1) {
            return 1;
        } if (n % divisor == 0) {
            return 0;
        }
        return fillInThePrimeNumber(n, divisor - 1);
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter num: ");
        int n = sc.nextInt();
        int result= fillInThePrimeNumber(n, n / 2);

        if (result == 1) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " not is a prime number");
        }
    }
}