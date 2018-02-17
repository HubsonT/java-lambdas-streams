package javabrains.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import javabrains.unit1.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlote", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		System.out.println("Before sorting:");
		performConditionally(people, p -> true, p -> System.out.println(p));

		// Step 1 - sort list by last name:
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("\nAfter sorting by last name(ascending):");
		performConditionally(people, p -> true, p -> System.out.println(p));

		System.out.println("\nPrint conditionally - all the people that have last name beginning with C");
		performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

		System.out.println("\nPrint conditionally - all the names of the people that have first name beginning with C");
		performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));

	}

	// Step 2, 3 - create a method that prints all the people conditionally
	// private static void printConditionally(List<Person> people, Predicate<Person>
	// predicate) {
	// for (Person person : people) {
	// if (predicate.test(person)) {
	// System.out.print(person);
	// }
	// }
	// }

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

}
