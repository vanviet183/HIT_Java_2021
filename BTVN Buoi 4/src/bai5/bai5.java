package bai5;

import java.util.Arrays;

public class bai5 {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static boolean isPrime(long n) {
        if (n == (int) n) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return n > 1;
        } else {
            return false;
        }
    }

    public static boolean isPrime(float n) {
        if (n == (int) n) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return n > 1;
        } else {
            return false;
        }
    }

    public static boolean isPrime(double n) {
        if (n == (int) n) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return n > 1;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Integer ===== ");
        System.out.println(isPrime(7));
        System.out.println(isPrime(9));
        System.out.println("===== Long ===== ");
        System.out.println(isPrime(13l));
        System.out.println(isPrime(15l));
        System.out.println("===== Float ===== ");
        System.out.println(isPrime(3.33262463f));
        System.out.println(isPrime(3.33f));
        System.out.println("===== Double ===== ");
        System.out.println(isPrime(3.326443));
        System.out.println(isPrime(3.0));
    }
}
