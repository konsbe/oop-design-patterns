public class Fibonacci {
    /*
    * this class represents a fibonacci calculation 0 1 1 2 3 5 8 13 21 34 55 89 ...
    * programmatically this is calculated as f(n) = f(n-1)+f(n-2)
    * e.g. n=5:
    * f(5) = f(4)+f(3), f(4) = f(3)+f(2), f(3) = f(2)+f(1), f(2) = f(1)+f(0)
    * as we see f(3), f(2) we will calculate it 2 times this will make our program very slow for large numbers
    * the solution for this is to cache data in the memory
    */
    
    // we are using a static array to cache the data in memory
    private static long[] fibonacciCache;
    public static void main(String[] agrs){
        int n = 50;
        fibonacciCache = new long[n+1];

        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        // check for values 0 and 1
        if (n <= 1) return n;
        if (fibonacciCache[n] != 0) return fibonacciCache[n];

        // nth Fibonacci Number, we using the cache to add values and operations
        fibonacciCache[n] = (fibonacci(n-1) + fibonacci(n-2));

        return fibonacciCache[n];
    }

}

