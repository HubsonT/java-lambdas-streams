package oracle.lambdas1;

import java.util.List;
import java.util.function.Predicate;

// Drivers: Persons over the age of 16
// Draftees: Male persons between the ages of 18 and 25
// Pilots (specifically commercial pilots): Persons between the ages of 23 and
// 65

public class RoboCallTestLambda {

	public static void main(String[] args) {

		List<Person> pl = Person.createShortList();

		RoboContactMethodsLambda robo = new RoboContactMethodsLambda();

		Predicate<Person> allDrivers = p -> p.getAge() >= 16;
		Predicate<Person> allDraftees = p -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
		Predicate<Person> allPilots = p -> p.getAge() >= 23 && p.getAge() <= 65;

		System.out.println("\n==== Test 03 ====");

		System.out.println("\n=== Calling all Drivers ===");
		robo.phoneContacts(pl, allDrivers);

		System.out.println("\n=== Emailing all Draftees ===");
		robo.emailContacts(pl, allDraftees);

		System.out.println("\n=== Mail all Pilots ===");
		robo.mailContacts(pl, allPilots);

	}

}
