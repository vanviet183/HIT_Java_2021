package bai4;

import java.util.Scanner;

public class PHONGMAY {
    private String idRoom;
    private String nameRoom;
    private double areaRoom;
    private QUANLY x;
    private MAY[] y;
    private int n;

    Scanner sc = new Scanner(System.in);
    public void Input() {
        System.out.print("Enter room's id: ");
        idRoom = sc.nextLine();
        System.out.print("Enter room's name: ");
        nameRoom = sc.nextLine();
        System.out.print("Enter room's area: ");
        areaRoom = sc.nextDouble();
        x = new QUANLY();
        x.Input();
        System.out.print("Enter quantity machine: ");
        n = sc.nextInt();
        y = new MAY[n];
        for(int i = 0; i < n; i++) {
            y[i] = new MAY();
            System.out.println("\tEnter machine " + (i + 1) +": ");
            y[i].Input();
        }
    }

    public void Output() {
        System.out.println("Room's id: " + idRoom);
        System.out.println("Room's name: " + nameRoom);
        System.out.println("Room's area: " + areaRoom);
        x.Output();
        for(int i = 0; i < n; i++) {
            y[i].Output();
        }
    }
}
