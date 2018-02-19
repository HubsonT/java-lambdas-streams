package oracle.lambdas1;

import java.util.List;
import java.util.OptionalDouble;

public class Test04Map {
	public static void main(String[] args) {
		List<Person> pl = Person.createShortList();
		SearchCriteria search = SearchCriteria.getInstance();

		// calculate average age of pilots - old style
		System.out.println("== Calc Old Style ==");
		int sum = 0;
		double count = 0;
		double average;
		for (Person p : pl) {
			if (p.getAge() >= 23 && p.getAge() <= 65) {
				sum = sum + p.getAge();
				count++;
			}
		}
		average = sum / count;
		System.out.println("Total Ages: " + sum);
		System.out.println("Average Age: " + average);

		// calculate average age of pilots - lambda style

		System.out.println("\n== Calc New Style ==");
		// Get sum of ages
		long totalAge = pl
			.stream()
			.filter(search.getCriteria("allPilots"))
			.mapToInt(p -> p.getAge())
			.sum();

		// Get average of ages
		OptionalDouble averageAge = pl
			.parallelStream()
			.filter(search.getCriteria("allPilots"))
			.mapToDouble(p -> p.getAge())
			.average();
		System.out.println("Total Ages: " + totalAge);
		System.out.println("Average Age: " + averageAge.getAsDouble());
	}
}
