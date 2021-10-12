package btvn_java_buoi1;

import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        int m, n;
        m = 6;
        n = 8;

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == m) {
                    System.out.print("*");
                } else {
                    if(j == 1 || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
