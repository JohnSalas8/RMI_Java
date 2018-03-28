package client;

import compute.Task;
import java.io.Serializable;
import java.math.BigDecimal;

public class Fibonacci implements Task<String>, Serializable {

    static int until = 0;
    static String fib = "0, 1";

    public Fibonacci(int until) {
        this.until = until;
    }

    public String execute() {
        return computeFibonacci();
    }

    public static String computeFibonacci() {
        getFibonacci(0, 0, 1);
        return fib;
    }

    private static void getFibonacci(int i, int n1, int n2) {
        if (until != i) {
            int t = n1 + n2;
            fib += ", " + t;
            getFibonacci(i++, n2, t);
        }
    }
    
}