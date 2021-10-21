package bai3;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String s = sc.nextLine();
        int n = s.length();
        int dem = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                dem++;
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));  // String.valueOf()  -> chuyen sang kieu String
            }
        }
        if (dem > 0) {
            System.out.println("true");
            System.out.println("Tong cac chu so trong chuoi = " + sum);
            System.out.println("TBC cac chu so = " + (float)sum / dem);
        } else {
            System.out.println(false);
        }
    }
}
