package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter quantity product: ");
        n = sc.nextInt();
        ArrayList<AirConditional> a = new ArrayList<AirConditional>();
        for(int i = 0; i < n; i++) {
            AirConditional aItem = new AirConditional();
            System.out.println("\tProduct " + (i + 1) + ": ");
            aItem.Input();
            a.add(aItem);
        }
        int dem = 0;
        for(int i = 0; i < n; i++) {
            if(a.get(i).getNameBrand().compareToIgnoreCase("Electrolux")==0) {
                dem++;
            }
        }
        if(dem > 0) {
            System.out.println("Product's name is Electrolux: ");
            for(int i = 0; i < n; i++) {
                if(a.get(i).getNameBrand().compareToIgnoreCase("Electrolux")==0) {
                    a.get(i).Output();
                }
            }
        } else {
            System.out.println("Don't have product's name is Electrolux");
        }

        AirConditional aMinPrice = a.get(0);
        for (int i = 0; i < n; i++) {
            if(a.get(i).getPrice() < aMinPrice.getPrice()) {
                aMinPrice = a.get(i);
            }
        }
        System.out.println("Product has min price product: ");
        aMinPrice.Output();
    }
}
