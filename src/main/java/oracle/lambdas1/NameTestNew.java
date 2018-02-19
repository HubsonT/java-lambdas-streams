package oracle.lambdas1;

import java.util.List;
import java.util.function.Function;

/**
 * @author MikeW
 */
public class NameTestNew {

	public static void main(String[] args) {

		System.out.println("\n==== NameTestNew ===");

		List<Person> list1 = Person.createShortList();
		// Define custom first name and email
		Function<Person, String> nameAndEmail = p -> "Name: " + p.getGivenName() + ", email: " + p.geteMail();

		Function<Person, String> westernStyle = p -> {

			return "\nName: " + p.getGivenName() + " " + p.getSurName() + "\n" +
					"Age: " + p.getAge() + "  " + "Gender: " + p.getGender() + "\n" +
					"EMail: " + p.geteMail() + "\n" +
					"Phone: " + p.getPhone() + "\n" +
					"Address: " + p.getAddress();
		};

		Function<Person, String> easternStyle = p -> {

			return "\nName: " + p.getSurName() + " " + p.getGivenName() + "\n" +
					"Age: " + p.getAge() + "  " + "Gender: " + p.getGender() + "\n" +
					"EMail: " + p.geteMail() + "\n" +
					"Phone: " + p.getPhone() + "\n" +
					"Address: " + p.getAddress();
		};

		// Print custom first name and email
		System.out.println("===Custom List===");
		for (Person person : list1) {
			System.out.println(person.printCustom(nameAndEmail));
		}

		// Print Names Western
		System.out.println("\n===Print Western Names===");
		for (Person person : list1) {
			System.out.println(person.printCustom(westernStyle));
		}

		// Print Names Eastern
		System.out.println("\n===Print Eastern Names===");
		for (Person person : list1) {
			System.out.println(person.printCustom(easternStyle));
		}

	}

}
