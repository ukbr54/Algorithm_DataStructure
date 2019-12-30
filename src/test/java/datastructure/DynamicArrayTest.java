package datastructure;


import com.made.easy.dataStructure.array.DynamicArray;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DynamicArrayTest {

    @Test
    public void testEmptyList(){
        DynamicArray<Integer> list = new DynamicArray<Integer>();
        assertTrue(list.isEmpty());
    }

    @Test(expected = Exception.class)
    public void testRemovingEmptyList(){
        DynamicArray<Integer> list = new DynamicArray<Integer>();
        list.removeAt(0);
    }

    @Test(expected = Exception.class)
    public void testIndexOutOfBound(){
        DynamicArray<Integer> list = new DynamicArray<Integer>();
        list.add(-10);
        list.add(-20);
        list.add(-30);

        Assert.assertEquals(list.size(),3);
        list.removeAt(3);
    }

    @Test(expected = Exception.class)
    public void testIndexOutOfBounds2() {
        DynamicArray<Integer> list = new DynamicArray<Integer>();
        for (int i = 0; i < 1000; i++) list.add(789);
        list.removeAt(1000);
    }

    @Test(expected = Exception.class)
    public void testIndexOutOfBounds3() {
        DynamicArray<Integer> list = new DynamicArray<Integer>();
        for (int i = 0; i < 1000; i++) list.add(789);
        list.removeAt(-1);
    }

    @Test(expected = Exception.class)
    public void testIndexOutOfBounds4() {
        DynamicArray<Integer> list = new DynamicArray<Integer>();
        for (int i = 0; i < 15; i++) list.add(123);
        list.removeAt(-66);
    }

    @Test
    public void testRemoving(){
        DynamicArray<String> list = new DynamicArray<String>();
        String[] strs = {"a","b","c","d","e",null,"g","h"};
        for(String s : strs) list.add(s);

        boolean ret = list.remove("c");
        assertTrue(ret);

        ret = list.remove("c");
        assertFalse(ret);

        ret = list.remove("h");
        assertTrue(ret);

        ret = list.remove(null);
        assertTrue(ret);

        ret = list.remove("a");
        assertTrue(ret);

        ret = list.remove("a");
        assertFalse(ret);

        ret = list.remove("h");
        assertFalse(ret);

        ret = list.remove(null);
        assertFalse(ret);
    }

    @Test
    public void testRemoving2() {

        DynamicArray<String> list = new DynamicArray<String>();
        String[] strs = {"a", "b", "c", "d"};
        for (String s : strs) list.add(s);

        assertTrue(list.remove("a"));
        assertTrue(list.remove("b"));
        assertTrue(list.remove("c"));
        assertTrue(list.remove("d"));

        assertFalse(list.remove("a"));
        assertFalse(list.remove("b"));
        assertFalse(list.remove("c"));
        assertFalse(list.remove("d"));
    }

    @Test
    public void testIndexOfNullElement(){
        String[] strs = {"a","b",null,"c"};
        DynamicArray<String> list = new DynamicArray<String>();
        for(String str : strs) list.add(str);

        Assert.assertTrue(list.indexOf(null) == 2);
    }

    @Test
    public void testAddingElement(){
        DynamicArray<Integer> list = new DynamicArray<Integer>();
        int[] elems = {1,2,3,4,5,6,7};
        for(int i=0; i<elems.length; i++){
            list.add(elems[i]);
        }
        for (int i = 0; i < elems.length; i++) assertEquals(list.get(i).intValue(), elems[i]);
    }

    @Test
    public void testAddAndRemove() {

        DynamicArray<Long> list = new DynamicArray<Long>(0);

        for (int i = 0; i < 55; i++) list.add(44L);
        for (int i = 0; i < 55; i++) list.remove(44L);
        assertTrue(list.isEmpty());

        for (int i = 0; i < 55; i++) list.add(44L);
        for (int i = 0; i < 55; i++) list.removeAt(0);
        assertTrue(list.isEmpty());

        for (int i = 0; i < 155; i++) list.add(44L);
        for (int i = 0; i < 155; i++) list.remove(44L);
        assertTrue(list.isEmpty());

        for (int i = 0; i < 155; i++) list.add(44L);
        for (int i = 0; i < 155; i++) list.removeAt(0);
        assertTrue(list.isEmpty());
    }
}
