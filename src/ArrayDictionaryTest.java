import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
    }

    @Test
    public void remove() {
        // homework

        // set 1







        assertTrue(false);  // place holder
    }

    @Test
    public void contains() {
        // homework

        // set 1
        ArrayDictionary set1 = new ArrayDictionary(1);
        assertTrue(!set1.contains(-1));
        assertTrue(!set1.contains(0));
        assertTrue(!set1.contains(1));

        // set 2
        ArrayDictionary set2 = new ArrayDictionary(1);
        set2.add(0, 103);
        assertTrue(!set2.contains(2));
        assertTrue(set2.contains(0));

        // set 3
        ArrayDictionary set3 = new ArrayDictionary(2);
        set3.add(0, 103);
        set3.add(1, 105);
        assertTrue(set3.contains(0));
        assertTrue(set3.contains(1));
        assertTrue(!set3.contains(2));
        assertTrue(!set3.contains(3));

        // set 4
        ArrayDictionary set4 = new ArrayDictionary(3);
        set4.add(0, 103);
        set4.add(1, 105);
        assertTrue(!set4.contains(3));
        set4.add(2, 206);
        assertTrue(set4.contains(1));

        // set 5
        ArrayDictionary set5 = new ArrayDictionary(3);
        set5.add(0, 103);
        set5.add(1, 105);
        set5.add(2, 206);
        set5.add(4, 407);
        assertTrue(set5.contains(1));
        assertTrue(set5.contains(4));
        assertTrue(!set5.contains(7));
        assertTrue(!set5.contains(8));
    }
}