package JavaAdvanced.Capitolo1.esercizio7;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void test_if_hashSet_is_filled() {
        Set<Integer> result = Main.hashSet();
        assertFalse(result.isEmpty());
    }

    @Test
    public void test_if_hashSet_is_null() {
        Set<Integer> result = Main.hashSet();
        assertNotNull(result);
    }

    @Test
    public void test_if_no_null_element_exist() {
        Set<Integer> result = Main.hashSet();
        boolean exist = result.contains(null);
        assertFalse(exist);

    }


}