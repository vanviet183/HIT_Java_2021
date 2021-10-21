package bai2;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import static java.lang.Math.sqrt;

public class bai2 {
    static int n, k;
    static int[] a;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("1.Tạo và nhập mảng với n số nguyên");
            System.out.println("2.Hiển thị mảng vừa tạo");
            System.out.println("3.Thêm 1 phần tử vào vị trí k bất kỳ");
            System.out.println("4.Xóa 1 phần tử tại vị trí k bất kỳ");
            System.out.println("5.Đảo ngược mảng");
            System.out.println("6.Hiển thị phần tử a[1] và các số chia hết cho a[1]");
            System.out.println("7.Xuất ra màn hình tổng các số nguyên tố có trong mảng");
            System.out.println("8.Thoát  (Khi nhấn thoát thì chương trình mới kết thúc)");
            System.out.print("Nhập lựa chọn: ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    createArr();
                    break;
                case 2:
                    showArr();
                    break;
                case 3:
                    insertElement();
                    break;
                case 4:
                    deleteElement();
                    break;
                case 5:
                    reverse();
                    break;
                case 6:
                    elementA1();
                    break;
                case 7:
                    sumPrime();
                    break;
                case 8:
                    System.exit(1);
                default:
                    break;
            }
        } while (true);
    }

    // 1.
    public static void createArr() {
        System.out.print("Nhap n = ");
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    // 2.
    public static void showArr() {
        System.out.print("\tMang da khoi tao: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // 3.
    public static void insertElement() {
        System.out.print("Nhap vtri k = ");
        do {
            k = sc.nextInt();
        } while(k < 1 || k > n);
        int aIndex = a.length - 1;
        int[] aNew = new int[n + 1];

        for (int i = n; i >= 0; i--) {
            if(i >= k && aIndex > 0) {
                aNew[i] = a[aIndex--];
            } else if(i == k - 1) {
                aNew[k - 1] = 100;
            }  else {
                aNew[i] = a[aIndex--];
            }
        }
        System.out.print("\tMang sau khi chen: ");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(aNew[i] + " ");
        }
        System.out.println();
    }

    // 4.
    public static void deleteElement() {
        System.out.print("Nhap vtri k = ");
        do {
            k = sc.nextInt();
        } while (k < 1 || k > n);
        int[] aReduce = new int[n - 1];
        for (int i = 0; i < n; i++) {
            if(i < k) {
                aReduce[i] = a[i];
            } else {
                aReduce[i - 1] = a[i];
            }
        }
        System.out.print("\tMang sau khi xoa: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(aReduce[i] + " ");
        }
        System.out.println();
    }

    // 5.
    public static void reverse() {
        System.out.print("\tMang sau khi dao: ");
        int[] reverseArray = new int[n];
        int x = 0;
        for (int i = n - 1; i >= 0; i--) {
            reverseArray[x] = a[i];
            x++;
        }
        for (int i = 0; i < x; i++) {
            System.out.print(reverseArray[i] + " ");
        }
        System.out.println();
    }

    // 6.
    public static void elementA1() {
        System.out.println("a[1] = " + a[1]);
        if (a[1] == 0) {
            System.out.println("a[1] = 0");
        } else {
            System.out.print("\tCac so chia het cho a[1] la: ");
            for (int i = 0; i < n; i++) {
                if (a[i] % a[1] == 0) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
    }

    // 7.
    public static boolean isPrime(int n) {
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sumPrime() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(a[i])) {
                sum += a[i];
            }
        }
        System.out.print("\tTong cac so nguyen to trong mang la: " + sum);
        System.out.println();
    }

}
