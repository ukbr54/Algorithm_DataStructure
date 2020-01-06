package datastructure.linkedlist;

import com.made.easy.dataStructure.linkedlist.doubly.DoublyLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DoublyLinkedListTest {

    DoublyLinkedList<Integer> list;

    @Before
    public void setup(){
        list = new DoublyLinkedList<Integer>();
    }

    @Test
    public void testEmptyList(){
        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(list.size(),0);
    }

    @Test
    public void testAddFirst(){
        list.addFirst(10);
        Assert.assertEquals(list.size(),1);
        list.addFirst(5);
        Assert.assertEquals(list.size(),2);
    }

    @Test
    public void testAddLast(){
        list.addLast(20);
        Assert.assertEquals(list.size(),1);
        list.addLast(10);
        Assert.assertEquals(list.size(),2);
    }

    @Test
    public void testAddAtPosition(){
        list.addFirst(40);
        list.addFirst(7);
        list.addFirst(15);
        list.addFirst(4);

        list.addAt(45,3);

        Assert.assertEquals(list.size(),5);
    }

    @Test
    public void testPeekFirst(){
        list.addFirst(4);
        list.addLast(10);

        Assert.assertTrue(list.peekFirst() == 4);
    }

    @Test
    public void testPeekLast(){
        list.addLast(10);
        list.addFirst(4);
        Assert.assertTrue(list.peekLast() == 10);
    }

    @Test
    public void clearTest(){
        list.addFirst(10);
        list.addLast(30);
        list.addAt(20,2);

        list.clear();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testRemoveFirst(){
        list.addFirst(10);
        list.removeFirst();
        Assert.assertTrue(list.isEmpty());

        list.addLast(20);
        list.addFirst(10);
        list.removeFirst();
        Assert.assertEquals(list.size(),1);
    }

    @Test
    public void testRemoveLast(){
        list.addLast(10);
        list.removeLast();
        Assert.assertTrue(list.isEmpty());

        list.addLast(20);
        list.addFirst(10);
        list.removeLast();
        Assert.assertEquals(list.size(),1);
    }

    @Test
    public void testRemoveAt(){
        list.add(10);
        list.add(20);
        list.add(30);

        Assert.assertEquals(list.size(),3);
        list.removeAt(1);
        Assert.assertEquals(list.size(),2);

        list.add(40);
        list.add(50);
        list.add(60);
        list.removeAt(0);
        list.removeAt(3);
        Assert.assertEquals(list.size(),3);
    }

    @Test
    public void testRemoving(){
        DoublyLinkedList<String> strs = new DoublyLinkedList<String>();
        strs.add("a");
        strs.add("b");
        strs.add(null);
        strs.add("c");
        strs.add("d");
        strs.add("e");
        strs.add("f");

        strs.remove(null);
        strs.remove("b");
        strs.remove("a");
        strs.remove("d");
        strs.remove("e");
        strs.remove("c");
        strs.remove("f");
        Assert.assertEquals(0, strs.size());

    }

    @Test
    public void testRemoveAt2(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.removeAt(0);
        list.removeAt(2);
        System.out.println(list);
        Assert.assertTrue(list.peekFirst() == 2);
        Assert.assertTrue(list.peekLast() == 3);

        list.removeAt(1);
        list.removeAt(0);
        Assert.assertEquals(list.size(),0);

    }
}
