package bai1;

import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter quantity book: ");
        n = sc.nextInt();
        SACH[] a = new SACH[n];
        for(int i = 0; i < n; i++) {
            a[i] = new SACH();
            System.out.println("\tEnter book " + (i + 1));
            a[i].Input();
        }
        System.out.println("\t===== Show information =====");
        for(int i = 0; i < n; i++) {
            a[i].Output();
        }
    }
}
