package bai2;

import java.util.Scanner;

public class Doccument {
    protected int id;
    protected String name;
    protected String publisher;
    protected double price;
    Scanner sc = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Doccument() {

    }

    public Doccument(int id, String name, String publisher, double price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public void Input() {
        System.out.print("Nhap id: ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        this.publisher = sc.nextLine();
        System.out.print("Nhap gia: ");
        this.price = sc.nextDouble();
    }

    public void Edit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        this.publisher = sc.nextLine();
        System.out.print("Nhap gia: ");
        this.price = sc.nextInt();
    }

    public void Output() {
        System.out.printf("%15s %15s %15s %15s ", id, name, publisher, price);
    }

}
