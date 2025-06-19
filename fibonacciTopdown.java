import java.util.HashMap;
import java.util.Map;
public class FibonacciTopDown {
    private Map<Integer, Long> memo = new HashMap<>();
    public long fib(int n) {
        if (n == 0 || n == 1) return n;
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }
    public static void main(String[] args) {
        FibonacciTopDown ft = new FibonacciTopDown();
        int n = 50;
        System.out.println("fib(" + n + ") = " + ft.fib(n));
    }
}
