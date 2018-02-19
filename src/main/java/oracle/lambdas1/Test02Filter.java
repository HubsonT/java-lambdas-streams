package oracle.lambdas1;

import java.util.List;

public class Test02Filter {

	public static void main(String[] args) {
		List<Person> pl = Person.createShortList();
		SearchCriteria searchCriteria = SearchCriteria.getInstance();
		System.out.println("\n=== Western Pilot Phone List ===");

		pl.stream()
			.filter(searchCriteria.getCriteria("allPilots"))
			.forEach(Person::printWesternName);

		System.out.println("\n=== Eastern Draftee Phone List ===");
		pl.stream()
			.filter(searchCriteria.getCriteria("allDraftees"))
			.forEach(Person::printEasternName);

	}

}
