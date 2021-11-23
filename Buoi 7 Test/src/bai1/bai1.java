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
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                dem++;
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        int mul = 1;
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9' && sum % Character.getNumericValue(str.charAt(i)) == 0) {
                mul *= Character.getNumericValue(str.charAt(i));
            }
        }
        if(dem > 0) {
            System.out.println("Chuoi co: " + dem + " chu so");
//            System.out.println("Tong cac chu so trong chuoi la: " + sum);
            System.out.println("Tich cac chu so trong chuoi la: " + mul);
        } else {
            System.out.println("Chuoi co: " + dem + " chu so");
        }

    }
}
