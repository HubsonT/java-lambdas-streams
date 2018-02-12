package javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

    public static void main(String[] args) {
	List<Person> people = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Caroll", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlote", "Bronte", 45),
            new Person("Matthew", "Arnold", 39));
	

        printAll(people);
        System.out.println("");
    
// Step 1 - sort list by last name:
	Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
	});
        
        printAll(people);
        System.out.println();
        System.out.println("All the people that have last name beginning with C");
        printLastNameBeginningWithC(people);
}

// Step 2 - create a method that prints all the elements in the list
    private static void printAll(List<Person> people) {
        for(Person p: people){
            System.out.print(p);
        }
    }
    
// Step 3 - create a method that prints all the people that have last name beginning with C
    private static void printLastNameBeginningWithC(List<Person> people) {
        for (Person p: people) {
            if (p.getLastName().startsWith("C")) {
                System.out.print(p);
            }
        }
    }
    

}
