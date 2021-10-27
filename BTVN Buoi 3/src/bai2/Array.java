package bai2;

import java.util.Scanner;

public class Array {
    private int[] a;
    private int n;
    public static Scanner sc = new Scanner(System.in);

    public Array() {
        a = null;
        n = 0;
    }

    public Array(int n) {
        this.n = n;
        a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public int[] getA() {
        return a;
    }

    public void InputData() {
        System.out.print("Nhap n = ");
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+ i +"] = ");
            a[i] = sc.nextInt();
        }
    }
    public void Show() {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public int Sum() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }
    public void Filter(Boolean flag) {
        if(flag) {
            System.out.print("Cac so chan: ");
            for (int i = 0; i < n; i++) {
                if(a[i] % 2 == 0) {
                    System.out.print(a[i] + " ");
                }
            }
        } else {
            System.out.print("Cac so le: ");
            for (int i = 0; i < n; i++) {
                if(a[i] % 2 != 0) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

}
