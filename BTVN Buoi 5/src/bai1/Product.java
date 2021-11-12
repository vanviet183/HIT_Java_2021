package bai1;

import java.util.Scanner;

public class Product {
    protected String idProduct;
    protected String nameProduct;
    protected String nameBrand;
    protected String date;

    Scanner sc = new Scanner(System.in);
    public void Input() {
        System.out.print("Enter idProduct: ");
        idProduct = sc.nextLine();
        System.out.print("Enter nameProduct: ");
        nameProduct = sc.nextLine();
        System.out.print("Enter nameBrand: ");
        nameBrand = sc.nextLine();
        System.out.print("Enter date: ");
        date = sc.nextLine();
    }

    public void Output() {
        System.out.print("idProduct: " + idProduct);
        System.out.print(", nameProduct: " + nameProduct);
        System.out.print(", nameBrand: " + nameBrand);
        System.out.print(", date: " + date);
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
