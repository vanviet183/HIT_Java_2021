package bai1;

import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Nhap vao chuoi: ");
        str = sc.nextLine();
        int n = str.length();
        int dem = 0;
        int mul = 1;
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                dem++;
                mul *= Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println("Chuoi co: " + dem + " chu so");
        System.out.println("Tich cac chu so trong chuoi la: " + mul);
    }
}
