/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baeldung;

import com.sun.istack.internal.logging.Logger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hubert
 */
public class FunctionalInterfaceUnitTest {

    @Test
    public void whenPassingLambdaToComputeIfAbsent_thenTheValueGetsComputedAndPutIntoMap() {
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", s -> s.length());
        assertEquals(new Integer(4), nameMap.get("John"));
        assertEquals(new Integer(4), value);

    }

    @Test
    public void whenUsingBiFunction_thenCanUseItToReplaceMapValues() {
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);

        salaries.replaceAll((name, oldValue) -> name.equals("Freddy") ? oldValue : oldValue + 10000);
        assertEquals(new Integer(50000), salaries.get("John"));
        assertEquals(new Integer(30000), salaries.get("Freddy"));
        assertEquals(new Integer(60000), salaries.get("Samuel"));

    }

    @Test
    public void whenUsingConsumerInForEach_thenConsumerExecutesForEachListElement() {
        List<String> names = Arrays.asList("John", "Freddy", "Samuel");
        names.forEach(name -> System.out.println("Hello, " + name));
    }
    
    @Test
    public void whenUsingBiConsumerInForEach_thenConsumerExecutesForEachMapElement() {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Freddy",24);
        ages.put("Samuel", 30);
        
        ages.forEach((name,age) -> System.out.println(name + " is " + age + " old."));
    }
    
    @Test
    public void whenUsingPredicateInFilter_thenListValuesAreFilteredOut() {
        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        
        assertEquals(2, namesWithA.size());
        assertTrue(namesWithA.contains("Angela"));
        assertTrue(namesWithA.contains("Aaron"));
        assertThat(namesWithA.size(), is(2) );
    }
    
    @Test
    public void whenUsingUnaryOperatorWithReplaceAll_thenAllValuesInTheListAreReplaced() {
        List<String> names = Arrays.asList("bob", "josh", "megan");
        
        names.replaceAll(String::toUpperCase);
        assertEquals("BOB", names.get(0));
        assertEquals("JOSH", names.get(1));
        assertEquals("MEGAN", names.get(2));
    }
}
