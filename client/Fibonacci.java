package client;

import compute.Task;
import java.io.Serializable;

public class Fibonacci implements Task<String>, Serializable {

    private int until = 0;
    private String fib = "0, 1";

    public Fibonacci(int until) {
        this.until = until;
        System.out.println(this.until);
    }

    public String execute() {
        System.out.println("Ejecutando");
        return computeFibonacci();
    }

    public String computeFibonacci() {
        getFibonacci(1, 0, 1);
        System.out.print("Termine de ejecutar!");
        return fib;
    }

    private void getFibonacci(int i, int n1, int n2) {
        System.out.println(n1 + " " + n2 + "->" + until + " " + i);
        if (until != i) {
            int t = n1 + n2;
            fib += ", " + t;
            System.out.println(t);
            getFibonacci(i+1, n2, t);
        }
    }

}