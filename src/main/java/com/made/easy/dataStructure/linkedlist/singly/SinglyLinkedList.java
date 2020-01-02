package com.made.easy.dataStructure.linkedlist.singly;


import com.made.easy.dataStructure.linkedlist.ListNode;

public class SinglyLinkedList {

    public int length = 0;//Length of the linked list
    private ListNode head;//It holds the head of the list

    public SinglyLinkedList(){
        this.length = 0;
    }

    /**
     * INSERT A NODE AT THE BEGINNING OF THE LIST
     * In this case, a new node is inserted before the current head node.
     * - Update the next pointer of new node, to pint to the current head.
     * - update head pointer to the new node
     *
     * @Param node - holds the new node data which we need to insert
     */

    public void insertAtBegin(ListNode node){
        node.setNext(head);
        head = node;
        length++;
    }

    /**
     * Inserting a node in singly linked list at the ending
     * - New nodes next pointer points to NULL.
     * Last nodes next pointer to the new node
     * @param node
     */
    public void insertAtEnd(ListNode node){
        if(head == null){
            head = node;
        }else{
            ListNode temp = head;

            while(temp.getNext() != null){
                temp = temp.getNext();
            }

            temp.setNext(node);
        }
        length++;
    }

    public void insert(int data, int position){

    }

    /**
     * Return a string representation of this collection, in the form ["str1","str2".....]
     *
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(head == null) return sb.append("]").toString();

        sb.append(head.getData());
        ListNode temp = head.getNext();
        while(temp != null){
            sb.append(", " + temp.getData());
            temp = temp.getNext();
        }
        return sb.append("]").toString();
    }
}
