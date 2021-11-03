package bai4;

import java.util.Scanner;

public class MAY {
    private String idMachine;
    private String typeMachine;
    private String status;

    Scanner sc = new Scanner(System.in);
    public void Input() {
        System.out.print("Enter machine's id: ");
        idMachine = sc.nextLine();
        System.out.print("Enter machine's type: ");
        typeMachine = sc.nextLine();
        System.out.print("Enter machine's status: ");
        status = sc.nextLine();
    }

    public void Output() {
        System.out.print("idMachine: " + idMachine);
        System.out.print(", typeMachine: " + typeMachine);
        System.out.print(", status: " + status);
        System.out.println();
    }
}
