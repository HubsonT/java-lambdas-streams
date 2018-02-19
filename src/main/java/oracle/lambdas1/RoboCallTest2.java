package oracle.lambdas1;

import java.util.List;

// Drivers: Persons over the age of 16
// Draftees: Male persons between the ages of 18 and 25
// Pilots (specifically commercial pilots): Persons between the ages of 23 and
// 65

public class RoboCallTest2 {

	public static void main(String[] args) {

		List<Person> pl = Person.createShortList();

		RoboContactMethods2 robo = new RoboContactMethods2();

		System.out.println("\n==== Test 02 ====");
		System.out.println("\n=== Calling all Drivers ===");
		robo.phoneContacts(pl, new MyTest<Person>() {

			@Override
			public boolean test(Person p) {
				return p.getAge() >= 16;
			}

		});

		System.out.println("\n=== Emailing all Draftees ===");
		robo.emailContacts(pl, new MyTest<Person>() {

			@Override
			public boolean test(Person p) {
				return p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
			}
		});
		System.out.println("\n=== Mail all Pilots ===");
		robo.mailContacts(pl, new MyTest<Person>() {

			@Override
			public boolean test(Person p) {
				return p.getAge() >= 23 && p.getAge() <= 65;
			}
		});

	}

}
