package bai1;

import java.util.Scanner;

public class AirConditional extends Product {
    private double wattage;
    private double price;

    Scanner sc = new Scanner(System.in);

    @Override
    public void Input() {
        super.Input();
        System.out.print("Enter wattage: ");
        wattage = sc.nextDouble();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.print("wattage: " + wattage);
        System.out.print(", price: " + price);
        System.out.println();
    }

    public double getWattage() {
        return wattage;
    }


    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
