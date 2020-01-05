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
}
