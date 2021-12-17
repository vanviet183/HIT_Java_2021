package btvnB10;

import java.util.Scanner;

public class Person implements Comparable <Person> {
    private int id;
    private String name;
    private String address;
    public Scanner sc = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person o) {
        if((getName().compareTo(o.getName())) == 0) {
            return getAddress().compareTo((o.getAddress()));
        }
        return getName().compareTo(o.getName());
    }

    public void input() {
        System.out.print("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
    }

    public void output() {
        System.out.println("id: " + getId() + ", name: " + getName() + ", address: " + getAddress());
    }

}
