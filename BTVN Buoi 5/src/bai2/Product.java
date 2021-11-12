package bai2;

import java.util.Scanner;

public class Product {
    private String idProduct;
    private String nameProduct;
    private int quantity;
    private double unitPrice;

    Scanner sc = new Scanner(System.in);

    public void InputProduct() {
        System.out.print("Enter idProduct: ");
        idProduct = sc.nextLine();
        System.out.print("Enter nameProduct: ");
        nameProduct = sc.nextLine();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        System.out.print("Enter unit price: ");
        unitPrice = sc.nextDouble();
    }

    public void OutputProduct() {
        System.out.printf("%20s %20s %20s %20s %20s\n", idProduct, nameProduct, quantity, unitPrice, quantity * unitPrice);
    }
}
