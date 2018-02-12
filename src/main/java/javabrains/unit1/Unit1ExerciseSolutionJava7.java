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
        System.out.println("\nAll the people that have last name beginning with C");
        printLastNameBeginningWithC(people);
        System.out.println("\nPrint conditionally - all the people that have last name beginning with C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return (p.getLastName().startsWith("C"));
            }
        });
        System.out.println("\nPrint conditionally - all the people that have first name beginning with C");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return (p.getFirstName().startsWith("C"));
            }
        });
        
}

// Step 2 - create a method that prints all the elements in the list
    private static void printAll(List<Person> people) {
        for(Person p: people){
            System.out.print(p);
        }
    }
    
// Step 3 - create a method that prints all the people that have last name beginning with C
//very inflexible implementation
    private static void printLastNameBeginningWithC(List<Person> people) {
        for (Person p: people) {
            if (p.getLastName().startsWith("C")) {
                System.out.print(p);
            }
        }
    }
    
    
    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person person : people) {
            if (condition.test(person)) {
                System.out.print(person);
            }
        }
    }
}

@FunctionalInterface
interface Condition {
    boolean test(Person p);
}
