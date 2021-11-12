package bai3;

import java.util.Scanner;

public class Student extends People {
    private String idStudent;
    private String major;
    private int keyCourse;

    Scanner sc = new Scanner(System.in);
    public Student() {

    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getKeyCourse() {
        return keyCourse;
    }

    public void setKeyCourse(int keyCourse) {
        this.keyCourse = keyCourse;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Enter idStudent: ");
        setIdStudent(sc.nextLine());
        System.out.print("Enter major: ");
        setMajor(sc.nextLine());
        System.out.print("Enter keyCourse: ");
        setKeyCourse(sc.nextInt());
    }

    @Override
    public void Output() {
        super.Output();
        System.out.printf("%20s %20s %20s\n", getIdStudent(), getMajor(), getKeyCourse());
    }
}
