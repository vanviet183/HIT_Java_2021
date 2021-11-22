package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassRoom classRoom = new ClassRoom();

        // Input
        System.out.print("Enter idClassRoom: ");
        classRoom.setIdClassRoom(sc.nextLine());
        System.out.print("Enter nameClassRoom: ");
        classRoom.setNameClassRoom(sc.nextLine());
        System.out.print("Enter dateOpen: ");
        classRoom.setDateOpen(sc.nextLine());
        System.out.print("Enter teacher: ");
        classRoom.setTeacher(sc.nextLine());
        System.out.print("Enter quantity student: ");
        classRoom.setN(sc.nextInt());
        for (int i = 0; i < classRoom.getN(); i++) {
            System.out.println("\tStudent " + (i + 1) + ": ");
            Student student = new Student();
            student.Input();
            classRoom.getStudent().add(student);
        }

        // Output
        System.out.println("\t==================== Classroom ====================");
        Output(classRoom);

        // Count student K15
        int dem = 0;
        for (int i = 0; i < classRoom.getN(); i++) {
            if (classRoom.getStudent().get(i).getKeyCourse() == 15) {
                dem++;
            }
        }
        System.out.println("Have " + dem + " student K15");

        // Sort
        for (int i = 0; i < classRoom.getN() - 1; i++) {
            for (int j = i + 1; j < classRoom.getN(); j++) {
                if (classRoom.getStudent().get(i).getKeyCourse() > classRoom.getStudent().get(j).getKeyCourse()) {
                    Student temp = classRoom.getStudent().get(i);
                    classRoom.getStudent().set(i, classRoom.getStudent().get(j));
                    classRoom.getStudent().set(j, temp);
                }
            }
        }
        System.out.println("\t==================== Classroom after sort ==================== ");
        Output(classRoom);
    }

    // Output
    public static void Output(ClassRoom a) {
        System.out.println("idClassRoom: " + a.getIdClassRoom());
        System.out.println("nameClassRoom: " + a.getNameClassRoom());
        System.out.println("dateOpen: " + a.getDateOpen());
        System.out.printf("%20s %20s %20s", "name", "date", "hometown");
        System.out.printf("%20s %20s %20s\n", "idStudent", "Major", "keyCourse");
        for (int i = 0; i < a.getN(); i++) {
            a.getStudent().get(i).Output();
        }
        System.out.println("teacher: " + a.getTeacher());
    }
}
