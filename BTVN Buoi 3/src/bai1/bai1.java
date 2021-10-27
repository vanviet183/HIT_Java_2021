package bai1;

import java.util.Arrays;

public class bai1 {
    public static void main(String[] args) {
        Person a = new Person("Viet", 19, "Nam", "Code");
        System.out.println(a);

        Person b = new Person();
        b.setName("Nguyen Van Viet");
        b.setAge(19);
        b.setGender("Nam");
        b.setHobby("Code");
        System.out.println(b);
    }
}
