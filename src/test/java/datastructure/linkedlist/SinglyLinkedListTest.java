package datastructure.linkedlist;

import com.made.easy.dataStructure.linkedlist.ListNode;
import com.made.easy.dataStructure.linkedlist.singly.SinglyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void insertAtBeginTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBegin(new ListNode(30));
        list.insertAtBegin(new ListNode(20));
        list.insertAtBegin(new ListNode(10));

        Assert.assertEquals("[10,20,30]","[10,20,30]");
    }

    @Test
    public void insertAtEnd(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(new ListNode(10));
        list.insertAtEnd(new ListNode(20));
        list.insertAtEnd(new ListNode(30));

        Assert.assertEquals("[10,20,30]","[10,20,30]");
    }

    @Test
    public void lengthTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(new ListNode(10));
        list.insertAtEnd(new ListNode(20));
        list.insertAtBegin(new ListNode(5));

        Assert.assertEquals(list.length,3);
    }

    @Test
    public void findCorrectPositionAndInsert(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(5,-1);
        list.insert(40,10);
        list.insert(10,1);
        list.insert(20,2);
        list.insert(30,3);

        Assert.assertEquals("[5, 10, 20, 30, 40]","[5, 10, 20, 30, 40]");
    }
}
