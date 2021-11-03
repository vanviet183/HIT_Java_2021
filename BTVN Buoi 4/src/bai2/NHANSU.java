package bai2;

import java.util.Scanner;

public class NHANSU {
    private String idPersonnel;
    private String namePersonnel;
    private DATE ns;

    Scanner sc = new Scanner(System.in);
    public void Input() {
        System.out.print("Enter personnel's id: ");
        idPersonnel = sc.nextLine();
        System.out.print("Enter personnel's name: ");
        namePersonnel = sc.nextLine();
        ns = new DATE();
        ns.Input();
    }

    public void Output() {
        System.out.println("Personnel's id: " + idPersonnel);
        System.out.println("Personnel's name: " + namePersonnel);
        System.out.print("Date: " );
        ns.Output();
    }
}
