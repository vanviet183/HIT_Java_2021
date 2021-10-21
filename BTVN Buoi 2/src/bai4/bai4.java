package bai4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi bat ki: ");
        String s = sc.nextLine();
        // Xoa khoang trang
        s = s.trim();

        // Xoa ki tu so
        s = s.replaceAll("[0-9]", "");

        // Giua 2 tu chi chua 1 khoang trang
        s = s.replaceAll("\\s{2,}", " ");

        // Ki tu dau moi tu phai viet hoa
        s = s.toLowerCase();
        String[] a = s.split(" ");
        String str = "";
        for(int i = 0; i < a.length; i++) {
            str += a[i].substring(0,1).toUpperCase() + a[i].substring(1) + " ";
        }
        System.out.println("Chuoi sau khi chuan hoa: " + str);
    }
}
