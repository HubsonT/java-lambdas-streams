package baeldung;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


port org.junit.Test;

public class HumanTest {

	@Test
	public void testPreLambdaSort() {
		List<Human> humans = new ArrayList<>();
		humans.add(new Human("Sarah", 10));
		humans.add(new Human("Jack", 12));

		Collections.sort(humans, new Comparator<Human>() {

			@Override
			public int compare(Human o1, Human o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		assertEquals("Jack", humans.get(0).getName());
	}

	@Test
	public void whenSortingEntitiesByName_thenCorrectlySorted() {
		List<Human> humans = new ArrayList<>();
		humans.add(new Human("Sarah", 10));
		humans.add(new Human("Jack", 12));

		humans.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));
		assertThat(humans.get(0), equalTo(new Human("Jack", 12)));
	}

}
