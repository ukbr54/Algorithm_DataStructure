package datastructure.linkedlist;

import com.made.easy.dataStructure.linkedlist.ListNode;
import com.made.easy.dataStructure.linkedlist.singly.SinglyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void insertAtBeginTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBegin(new ListNode(30,null));
        list.insertAtBegin(new ListNode(20,null));
        list.insertAtBegin(new ListNode(10,null));

        Assert.assertEquals("[10,20,30]","[10,20,30]");
    }

    @Test
    public void insertAtEnd(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(new ListNode(10,null));
        list.insertAtEnd(new ListNode(20,null));
        list.insertAtEnd(new ListNode(30,null));

        Assert.assertEquals("[10,20,30]","[10,20,30]");
    }

    @Test
    public void lengthTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(new ListNode(10,null));
        list.insertAtEnd(new ListNode(20,null));
        list.insertAtBegin(new ListNode(5,null));

        Assert.assertEquals(list.length,3);
    }
}
