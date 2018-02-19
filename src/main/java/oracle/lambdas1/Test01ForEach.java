package oracle.lambdas1;

import java.util.List;

public class Test01ForEach {

	public static void main(String[] args) {
		List<Person> pl = Person.createShortList();
		System.out.println("\n=== Western Phone List ===");
		pl.forEach(p -> p.printWesternName());

		System.out.println("\n=== Eastern Phone List ===");
		pl.forEach(Person::printEasternName); // method reference

		System.out.println("\n=== Custom Email List ===");
		pl.forEach(p -> {
			System.out.println(p.printCustom(r -> "\nName: " + r.getGivenName() + ", email:" + r.geteMail()));
		});
	}

}
