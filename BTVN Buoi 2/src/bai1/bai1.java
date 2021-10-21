package bai1;

import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = sc.nextInt();
        System.out.print("Nhap b = ");
        int b = sc.nextInt();
        System.out.print("Nhap c = ");
        int c = sc.nextInt();
        System.out.println("Max = " + findMax(a, b, c));
    }

    public static int findMax(int a, int b, int c) {
        int max;
        int max1 = a > b ? a : b;
        return max = max1 > c ? max1 : c;
    }
}
