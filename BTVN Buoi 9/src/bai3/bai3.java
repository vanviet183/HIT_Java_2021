package bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bai3 {
    static Scanner sc = new Scanner(System.in);
    static List<News> list = new ArrayList<>();
    public static void main(String[] args) {
        do {
            System.out.println("1.Insert news");
            System.out.println("2.View list news");
            System.out.println("3.Average rate");
            System.out.println("4.Exit");
            System.out.print("Enter choose: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    insertNews();
                    break;
                case 2:
                    viewListNews();
                    break;
                case 3:
                    averageRate();
                    break;
                case 4:
                    System.exit(1);
                default: break;
            }
        } while (true);
    }

    // 4
    public static void insertNews() {
        News news = new News();
        news.Input();
        list.add(news);
    }

    // 5
    public static void viewListNews() {
        list.forEach(e -> e.Display());
    }

    // 6
    public static void averageRate() {
        list.forEach(e -> {
            e.Calculate();
            e.Display();
        });
    }
}
