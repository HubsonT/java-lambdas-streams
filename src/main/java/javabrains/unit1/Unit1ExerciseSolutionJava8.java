package javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {

    public static void main(String[] args) {
	List<Person> people = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Caroll", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlote", "Bronte", 45),
            new Person("Matthew", "Arnold", 39));
	
        System.out.println("Before sorting:");
        printAll(people);
    
// Step 1 - sort list by last name:
	Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
        System.out.println("\nAfter sorting by last name(ascending):");
        printAll(people);
                
        System.out.println("\nPrint conditionally - all the people that have last name beginning with C");
        printConditionally(people, p -> p.getLastName().startsWith("C"));
        
        System.out.println("\nPrint conditionally - all the people that have first name beginning with C");
        printConditionally(people, p -> p.getFirstName().startsWith("C"));
        
}

// Step 2 - create a method that prints all the elements in the list
    private static void printAll(List<Person> people) {
        for(Person p: people){
            System.out.print(p);
        }
    }
    
// Step 3 - create a method that prints all the people conditionally
    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person person : people) {
            if (condition.test(person)) {
                System.out.print(person);
            }
        }
    }
}

