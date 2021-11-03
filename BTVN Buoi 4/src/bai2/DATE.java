package bai2;

import java.util.Scanner;

public class DATE {
    private int d;
    private int m;
    private int y;

    Scanner sc = new Scanner(System.in);
    public void Input() {
        System.out.print("Enter day: ");
        d = sc.nextInt();
        System.out.print("Enter month: ");
        m = sc.nextInt();
        System.out.print("Enter year: ");
        y = sc.nextInt();
    }

    public void Output() {
        System.out.println(d + "/" + m + "/" + y);
    }
}
