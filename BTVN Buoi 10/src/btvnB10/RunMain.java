package btvnB10;

import java.util.*;


public class RunMain {
    public static Scanner sc =new Scanner(System.in);
    public static List<Person> persons = new ArrayList<>();



    public static void main(String[] args) {
        System.out.print("Enter quantity person: ");
        int n = 0;
        try {
            n = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }


        for (int i = 0; i < n; i++) {
            Person person = new Person();
            boolean isCorrect = false;
            try {
                person.input();
            } catch(Exception exception) {
                isCorrect = true;
                System.out.println("Error: " + exception.getMessage());
            }
            if(!isCorrect) {
                persons.add(person);
            }
        }

        // Comparable
        System.out.println("Sort by name: ");
        Collections.sort(persons);
        for (Person person : persons)
            person.output();

        // Comparator
        System.out.println("Sort by id: ");
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getId() - p2.getId();
            }
        });

        for (Person person : persons)
            person.output();

    }


}
