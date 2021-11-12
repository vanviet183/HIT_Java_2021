package bai4;

import java.util.Arrays;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sum<Integer> sumInteger = new Sum(1,2);
        Sum<Long> sumLong = new Sum<Long>(11L, 12L);
        Sum<Float> sumFloat = new Sum(3.4f, 5.6f);
        Sum<Double> sumDouble = new Sum<Double>(7.8, 9.1);

        System.out.println("Sum Integer: " + (sumInteger.getSoA() + sumInteger.getSoB()));
        System.out.println("Sum Long: " + (sumLong.getSoA() + sumLong.getSoB()));
        System.out.println("Sum Float: " + (sumFloat.getSoA() + sumFloat.getSoB()));
        System.out.println("Sum Double: " + (sumDouble.getSoA() + sumDouble.getSoB()));
    }
}
