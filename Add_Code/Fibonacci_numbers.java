Recursive Approach:
  
  public class Fibonacci {
    public static long recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change this to the desired Fibonacci number.
        System.out.println("Fibonacci number at position " + n + " is " + recursiveFibonacci(n));
    }
}



Iterative Approach:

  public class Fibonacci {
    public static long iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        long fib = 0;
        long a = 0;
        long b = 1;
        
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        
        return fib;
    }

    public static void main(String[] args) {
        int n = 10; // Change this to the desired Fibonacci number.
        System.out.println("Fibonacci number at position " + n + " is " + iterativeFibonacci(n));
    }
}
