package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String idPhieu;
    private String namePhieu;
    private DateTime a;
    private ArrayList<Product> b = new ArrayList<>();
    private int n;

    Scanner sc = new Scanner(System.in);
    public void InputPhieu() {
        System.out.print("Enter idPhieu: ");
        idPhieu = sc.nextLine();
        System.out.print("Enter namePhieu: ");
        namePhieu = sc.nextLine();
        a = new DateTime();
        a.InputDate();
        System.out.print("Enter quantity product: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("\tProduct " + (i + 1) + ": ");
            Product bItem = new Product();
            bItem.InputProduct();
            b.add(bItem);
        }
    }

    public void OutputPhieu() {
        System.out.println("idPhieu: " + idPhieu);
        System.out.println("namPhieu: " + namePhieu);
        System.out.print("Date: ");
        a.OutputDate();
        System.out.printf("%20s %20s %20s %20s %20s\n", "idProduct", "nameProduct", "quantity", "unitPrice", "Money");
        for (int i = 0; i < n; i++) {
            b.get(i).OutputProduct();
        }
    }
}
