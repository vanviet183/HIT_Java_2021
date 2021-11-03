package bai3;

import java.util.Scanner;

public class Hang {
    private String idProduct;
    private String nameProduct;
    private double price;

    Scanner sc = new Scanner(System.in);
    public void Input() {
        System.out.print("Enter product's id   : ");
        idProduct = sc.nextLine();
        System.out.print("Enter product's name : ");
        nameProduct = sc.nextLine();
        System.out.print("Enter product's price: ");
        price = sc.nextDouble();
    }

    public void Output() {
        System.out.print("idProduct: " + idProduct);
        System.out.print(", productName: " + nameProduct);
        System.out.print(", price: " + price);
        System.out.println();
    }

    public double getPrice() {
        return price;
    }
}
