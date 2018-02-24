package baeldung;

import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Assert;

import org.junit.Test;

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

    @Test
    public final void whenSortingEntitiesByNameThenAge_thenCorrectlySorted() {
        //List<Human> humans = new ArrayList<>();
//        humans.add(new Human("Sarah", 12));
//        humans.add(new Human("Sarah", 10));
//        humans.add(new Human("Zack", 12));
        //guava - newArrayList method
        List<Human> humans = Lists.newArrayList(new Human("Sarah", 12), new Human("Sarah", 10), new Human("Zack", 12));

        humans.sort(Human::compareByNameThenAge);
        assertThat(humans.get(0), equalTo(new Human("Sarah", 10)));

    }

    @Test
    public void givenInstanceMethod_whenSortingEntitiesByName_thenCorrectlySorted() {
        List<Human> humans = Lists.newArrayList(new Human("Sarah", 10), new Human("Jack", 12));
        Collections.sort(humans, Comparator.comparing(Human::getName));
        assertThat(humans.get(0), equalTo(new Human("Jack", 12)));
    }

    @Test
    public void givenComposition_whenSortingEntitiesByNameThenAge_thenCorrectlySorted() {
        List<Human> humans = Lists.newArrayList(new Human("Sarah", 12), new Human("Sarah", 10), new Human("Zack", 12));
        humans.sort(Comparator.comparing(Human::getName).thenComparing(Human::getAge));
        assertThat(humans.get(0), equalTo(new Human("Sarah", 10)));
        
    }
    
    @Test
    public final void whenSortingEntitiesByAge_thenCorrectlySorted() {
        final List<Human> humans = Lists.newArrayList(new Human("Sarah", 10), new Human("Jack", 12));
        humans.sort((h1,h2)-> h1.getAge()-h2.getAge());
        
        //humans.sort((h1, h2) -> Ints.compare(h1.getAge(), h2.getAge()));
        Assert.assertThat(humans.get(0), equalTo(new Human("Sarah", 10)));
    }

}
