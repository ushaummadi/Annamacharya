public class FibonacciRecursion {
    public static long fib(long n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int terms = 10; 
        System.out.print("Fibonacci series up to " + terms + " terms: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
