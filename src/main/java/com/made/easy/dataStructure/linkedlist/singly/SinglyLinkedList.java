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
     * - Last nodes next pointer to the new node
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

    /**
     * Add a new value to the list at a given position.
     * @param data
     * @param position
     */
    public void insert(int data, int position){
        if(position < 0) position = 0;
        if(position > length) position = length;

        //if the list is empty, make it be the only element.
        if(this.head == null){
            head = new ListNode(data);
        }

        //if adding at the front of the list
        else if(position == 0){
            ListNode temp = new ListNode(data);
            temp.setNext(head);
            head = temp;
        }

        //else find the correct position and insert. Inserting the new element after position specified
        else{
            ListNode temp = head;
            for(int i=1; i<position; i++){
                temp = temp.getNext();
            }
            ListNode newNode = new ListNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
        length++;
    }

    /**
     * Remove and return the node at the head of the list
     * @return
     */
    public ListNode removeFromBegin(){
        if(this.head == null) throw new IllegalStateException("Linked List is empty") ;

        ListNode node = head;
        head = node.getNext();
        node.setNext(null);
        length--;
        return node;
    }

    /**
     * Remove and return the node at the end of the list
     * In this create two pointer where one pointer ahead of other pointer.
     * @return
     */
    public ListNode removeFromEnd(){
        if(this.head == null) throw new IllegalStateException("Linked List is empty") ;

        ListNode p =head, q=null;
        //if the list contain only one node
        if(p.getNext() == null){
            head = null;
            length--;
            return p;
        }
        //if the list contain more than one element
        while(p.getNext() != null){
            q = p;
            p = p.getNext();
        }
        q.setNext(null);
        length--;
        return p;
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
