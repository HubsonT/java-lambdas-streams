package javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import javabrains.unit1.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlote", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		System.out.println("Using a for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		System.out.println("Using enhanced for loop");
		for (Person p : people) {
			System.out.println(p);
		}
		System.out.println("Java 8 foreach way");
		people.forEach(p -> System.out.println(p));
		people.forEach(System.out::println);
		people.forEach(p -> System.out.println(p.getFirstName()));

	}

}
