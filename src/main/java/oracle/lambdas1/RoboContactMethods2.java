package oracle.lambdas1;

import java.util.List;

public class RoboContactMethods2 {
	// Drivers: Persons over the age of 16
	// Draftees: Male persons between the ages of 18 and 25
	// Pilots (specifically commercial pilots): Persons between the ages of 23 and
	// 65

	public void phoneContacts(List<Person> pl, MyTest<Person> aTest) {
		for (Person p : pl) {
			if (aTest.test(p)) {
				roboCall(p);
			}
		}
	}

	public void emailContacts(List<Person> pl, MyTest<Person> aTest) {
		for (Person p : pl) {
			if (aTest.test(p)) {
				roboEmail(p);
			}
		}
	}

	public void mailContacts(List<Person> pl, MyTest<Person> aTest) {
		for (Person p : pl) {
			if (aTest.test(p)) {
				roboMail(p);
			}
		}
	}

	public void roboCall(Person p) {
		System.out.println(
			"Calling " + p.getGivenName() + " " + p.getSurName() + ",age " + p.getAge() + " at " + p.getPhone());
	}

	public void roboEmail(Person p) {
		System.out.println(
			"Emailing " + p.getGivenName() + " " + p.getSurName() + ",age " + p.getAge() + " at " + p.geteMail());
	}

	public void roboMail(Person p) {
		System.out.println(
			"Mailing " + p.getGivenName() + " " + p.getSurName() + ",age " + p.getAge() + " at " + p.getAddress());
	}

}
