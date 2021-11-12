package bai2;

import java.util.Scanner;

public class DateTime {
    private int day;
    private int month;
    private int year;

    Scanner sc = new Scanner(System.in);

    public void InputDate() {
        System.out.print("Enter day: ");
        day = sc.nextInt();
        System.out.print("Enter month: ");
        month = sc.nextInt();
        System.out.print("Enter year: ");
        year = sc.nextInt();
    }

    public void OutputDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
