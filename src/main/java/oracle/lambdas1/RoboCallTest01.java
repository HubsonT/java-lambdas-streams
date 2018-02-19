package oracle.lambdas1;

import java.util.List;

// Drivers: Persons over the age of 16
// Draftees: Male persons between the ages of 18 and 25
// Pilots (specifically commercial pilots): Persons between the ages of 23 and
// 65

public class RoboCallTest01 {

	public static void main(String[] args) {

		List<Person> pl = Person.createShortList();
		System.out.println("==================");
		pl.stream()
			.forEach(p -> System.out.println(p));

		RoboContactMethods robo = new RoboContactMethods();

		System.out.println("\n==== Test 01 ====");
		System.out.println("\n=== Calling all Drivers ===");
		robo.callDrivers(pl);

		System.out.println("\n=== Emailing all Draftees ===");
		robo.emailDraftees(pl);

		System.out.println("\n=== Mail all Pilots ===");
		robo.mailPilots(pl);

	}

}
