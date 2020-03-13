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
        ArrayDictionary empty = new ArrayDictionary(1);
        assertTrue(!empty.remove(-1));
        assertTrue(!empty.remove(0));
        assertTrue(!empty.remove(1));

        ArrayDictionary testNoCollision = new ArrayDictionary(5);
        testNoCollision.add(0, 100);
        testNoCollision.add(1, 101);
        testNoCollision.add(3, 101);
        assertTrue(testNoCollision.remove(0));
        assertTrue(testNoCollision.remove(1));
        assertTrue(!testNoCollision.remove(2));
        assertTrue(testNoCollision.remove(3));
        assertTrue(!testNoCollision.remove(4));

        ArrayDictionary testCollision = new ArrayDictionary(5);
        testCollision.add(0, 100);
        testCollision.add(2, 102);
        testCollision.add(10, 110);
        testCollision.add(20, 120);
        assertTrue(testCollision.remove(0));
        assertTrue(testCollision.remove(2));
        assertTrue(!testCollision.remove(3));
        assertTrue(!testCollision.remove(5));
        assertTrue(testCollision.remove(10));
        assertTrue(!testCollision.remove(15));
        assertTrue(testCollision.remove(20));
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