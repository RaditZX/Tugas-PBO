package kasus3;

public class MathUtils {
    // -------------------------------------------------------------
    // Returns the factorial of the argument given
    // -------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Integer must be >= 0");
        } else if (n > 16) {
            throw new IllegalArgumentException("The factorial method can only take values < 17");
        }
    
        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}