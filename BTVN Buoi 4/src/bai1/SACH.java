package bai1;

import java.util.Scanner;

public class SACH {
    private String idBook;
    private String nameBook;
    private String nxb;
    private int quantityPage;
    private double price;

    Scanner sc = new Scanner(System.in);
    public void Input() {
        System.out.print("Enter book's id: ");
        idBook = sc.nextLine();
        System.out.print("Enter book's name: ");
        nameBook = sc.nextLine();
        System.out.print("Enter book's nxb: ");
        nxb = sc.nextLine();
        System.out.print("Enter quantity page: ");
        quantityPage = sc.nextInt();
        System.out.print("Enter book's price: ");
        price = sc.nextInt();
    }


    public void Output() {
        System.out.print("idBook: " + idBook);
        System.out.print(", nameBook: " + nameBook);
        System.out.print(", nxb: " + nxb);
        System.out.print(", quantity: " + quantityPage);
        System.out.print(", price: " + price);
        System.out.println();
    }
}
