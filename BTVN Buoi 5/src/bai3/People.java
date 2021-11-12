package bai3;

import java.util.Scanner;

public class People {
    protected String name;
    protected String date;
    protected String hometown;

    Scanner sc = new Scanner(System.in);
    public void Input() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter date: ");
        date = sc.nextLine();
        System.out.print("Enter hometown: ");
        hometown = sc.nextLine();
    }

    public void Output() {
        System.out.printf("%20s %20s %20s", name, date, hometown);
    }
}
