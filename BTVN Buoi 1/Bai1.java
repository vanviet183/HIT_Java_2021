package btvn_java_buoi1;

import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        int m, n;
        m = 4;
        for(int i = 1; i <= m; i++) {
            if(i % 2 != 0) {
                n = 2;
                System.out.print("   ");
                for(int j = 1; j <= n; j++) {
                    System.out.print("  *   ");
                }
            } else {
                if(i < 3) {
                    n = 3;
                    for(int j = 1; j <= n; j++) {
                        System.out.print("  *   ");
                    }
                } else {
                    n = 1;
                    System.out.print("        *");
                }
            }
            System.out.println();
        }
    }
}
