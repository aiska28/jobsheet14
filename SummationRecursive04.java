public class SummationRecursive04 {
    
    static int numberAddition(int n) {
        if (n == 1) {
            return 1;
        } else{
            return n+numberAddition(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 8;
        int result = numberAddition(n);
        System.out.println("Sum result: "+result);
    }
}
