package bai2;

import java.util.Arrays;

public class bai2 {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();

        System.out.println("Enter Arr1: ");
        arr1.InputData();
        System.out.println("Enter Arr2: ");
        arr2.InputData();

        float tbcArr1 = arr1.Sum() / arr1.getN();
        float tbcArr2 = arr2.Sum() / arr2.getN();
        if(tbcArr1 > tbcArr2) {
            System.out.println("TBC Arr1 > TBC Arr2");
        } else if (tbcArr2 > tbcArr1){
            System.out.println("TBC Arr2 > TBC Arr1");
        } else {
            System.out.println("Bye");
        }
    }
}
