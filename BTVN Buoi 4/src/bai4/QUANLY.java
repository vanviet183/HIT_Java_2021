package bai4;

import java.util.Scanner;

public class QUANLY {
    private String idManager;
    private String nameManager;

    Scanner sc = new Scanner(System.in);
    public void Input() {
        System.out.print("Enter manager's id: ");
        idManager = sc.nextLine();
        System.out.print("Enter manager's name: ");
        nameManager = sc.nextLine();
    }

    public void Output() {
        System.out.println("Manager's id: " + idManager);
        System.out.println("Manager's name: " + nameManager);
    }
}
