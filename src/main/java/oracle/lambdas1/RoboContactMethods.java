package oracle.lambdas1;

import java.util.List;

public class RoboContactMethods {
	// Drivers: Persons over the age of 16
	// Draftees: Male persons between the ages of 18 and 25
	// Pilots (specifically commercial pilots): Persons between the ages of 23 and
	// 65

	public void callDrivers(List<Person> pl) {
		for (Person p : pl) {
			if (p.getAge() >= 16) {
				roboCall(p);
			}
		}
	}

	public void emailDraftees(List<Person> pl) {
		for (Person p : pl) {
			if (p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE) {
				roboEmail(p);
			}
		}
	}

	public void mailPilots(List<Person> pl) {
		for (Person p : pl) {
			if (p.getAge() >= 23 && p.getAge() <= 65) {
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
