import java.util.Scanner;

public class DescendingSequenceRecursive04 {
    static int sequenceRekursif(int n) { 
        if (n < 0) {
            return 0;
        } else {
            System.out.print(n + " ");
            return sequenceRekursif(n - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sequence using recursion: ");
        sequenceRekursif(n);
    }
}