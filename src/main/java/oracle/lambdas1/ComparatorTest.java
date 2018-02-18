package oracle.lambdas1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Person> personList = Person.createShortList();

		personList.stream()
			.forEach(p -> System.out.println(p.getGivenName() + " " + p.getSurName()));

		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getSurName().compareTo(o2.getSurName());
			}

		});
		System.out.println("==================");
		personList.stream()
			.forEach(p -> System.out.println(p.getGivenName() + " " + p.getSurName()));

		System.out.println("====LAMBDA WAY - ASC====");
		Collections.sort(personList, (p1, p2) -> p1.getSurName().compareTo(p2.getSurName()));
		Person.printNamesFromTheList(personList);

		System.out.println("====LAMBDA WAY - DESC====");
		Collections.sort(personList, (p1, p2) -> p2.getSurName().compareTo(p1.getSurName()));
		Person.printNamesFromTheList(personList);

	}

}
