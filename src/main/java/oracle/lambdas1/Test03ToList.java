package oracle.lambdas1;

import java.util.List;
import java.util.stream.Collectors;

public class Test03ToList {
	public static void main(String[] args) {
		List<Person> pl = Person.createShortList();
		SearchCriteria search = SearchCriteria.getInstance();

		List<Person> pilotList = pl
			.stream()
			.filter(search.getCriteria("allPilots"))
			.collect(Collectors.toList());

		System.out.println("\n=== Western Pilot Phone List ===");
		pilotList.forEach(Person::printWesternName);
	}

}
