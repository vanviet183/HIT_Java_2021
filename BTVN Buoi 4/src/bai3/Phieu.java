package bai3;

import java.util.Scanner;

public class Phieu {
    private String idBill;
    private Hang[] x;
    private int n;

    Scanner sc = new Scanner(System.in);
    public void  Input() {
        System.out.print("Enter bill's id: ");;
        idBill = sc.nextLine();
        System.out.print("Enter quantity product: ");
        n = sc.nextInt();
        x = new Hang[n];
        for(int i = 0; i < n; i++) {
            x[i] = new Hang();
            System.out.println("\tEnter product "+ (i + 1) +": ");
            x[i].Input();
        }
    }

    public void Output() {
        System.out.println("Bill's Id: " + idBill);
        for(int i = 0; i < n; i++) {
            x[i].Output();
        }
        double sumMoney = 0;
        for(int i = 0; i < n; i++) {
            sumMoney += x[i].getPrice();
        }
        System.out.println("Sum money: " + sumMoney);
    }
}
