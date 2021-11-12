package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassRoom a = new ClassRoom();

        // Input
        System.out.print("Enter idClassRoom: ");
        a.setIdClassRoom(sc.nextLine());
        System.out.print("Enter nameClassRoom: ");
        a.setNameClassRoom(sc.nextLine());
        System.out.print("Enter dateOpen: ");
        a.setDateOpen(sc.nextLine());
        System.out.print("Enter teacher: ");
        a.setTeacher(sc.nextLine());
        System.out.print("Enter quantity student: ");
        a.setN(sc.nextInt());
        for (int i = 0; i < a.getN(); i++) {
            System.out.println("\tStudent " + (i + 1) + ": ");
            Student student = new Student();
            student.Input();
            a.getX().add(student);
        }

        // Output
        System.out.println("\t==================== Classroom ====================");
        Output(a);

        // Count student K15
        int dem = 0;
        for (int i = 0; i < a.getN(); i++) {
            if (a.getX().get(i).getKeyCourse() == 15) {
                dem++;
            }
        }
        System.out.println("Have " + dem + " student K15");

        // Sort
        for (int i = 0; i < a.getN() - 1; i++) {
            for (int j = i + 1; j < a.getN(); j++) {
                if (a.getX().get(i).getKeyCourse() > a.getX().get(j).getKeyCourse()) {
                    Student temp = a.getX().get(i);
                    a.getX().set(i, a.getX().get(j));
                    a.getX().set(j, temp);
                }
            }
        }
        System.out.println("\t==================== Classroom after sort ==================== ");
        Output(a);
    }

    // Output
    public static void Output(ClassRoom a) {
        System.out.println("idClassRoom: " + a.getIdClassRoom());
        System.out.println("nameClassRoom: " + a.getNameClassRoom());
        System.out.println("dateOpen: " + a.getDateOpen());
        System.out.printf("%20s %20s %20s", "name", "date", "hometown");
        System.out.printf("%20s %20s %20s\n", "idStudent", "Major", "keyCourse");
        for (int i = 0; i < a.getN(); i++) {
            a.getX().get(i).Output();
        }
        System.out.println("teacher: " + a.getTeacher());
    }
}
