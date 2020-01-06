package com.made.easy.dataStructure.linkedlist.doubly;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T>{

    private static class Node<T>{
        private T data;
        private Node<T> prev,next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    private int size = 0;
    private Node<T> head= null;
    private Node<T> tail = null;

    /**
     * Check the value of first node if it exists, O(1)
     * @return
     */
    public T peekFirst(){
        if (isEmpty()) throw new RuntimeException("Empty list");
        return head.data;
    }

    /**
     * Check the value of the last node if it exists, O(1)
     * @return
     */
    public T peekLast(){
        if(isEmpty()) throw new RuntimeException("Empty List");
        return tail.data;
    }

    /**
     * Add an element to the beginning of the linked list O(1)
     */
    public void addFirst(T elem){
        if(isEmpty()){
            head = tail = new Node<T>(elem,null,null);
        }else{
            head.prev = new Node<T>(elem,null,head);
            head = head.prev;
        }
        size++;
    }

    /**
     * Add an element to the tail of the linked list o(1)
     * @param elem
     */
    public void addLast(T elem){
        if(isEmpty()){
            head = tail = new Node<T>(elem,null,null);
        }else{
            tail.next = new Node<T>(elem,tail,null);
            tail = tail.next;
        }
        size++;
    }

    /**
     * Add a new value to the list at a given position.
     * All values at that position to the end move over to make room.
     * @param elem
     * @param index
     */
    public void addAt(T elem,int index){
        if(index < 0) index = 0;
        if(index > size) index = size;

        //if the list is empty, make it be the only element
        if(isEmpty()){
            head = tail = new Node<T>(elem,null,null);
        }
        //if adding at the front of the list
        else if(index == 0){
            addFirst(elem);
        }

        //else find the correct position and insert
        else{
            Node<T> trav = head;
            for(int i=1; i<index; i++){
                trav = trav.next;
            }
            final Node<T> node = new Node<T>(elem, trav.next.prev, trav.next);
            trav.next = node;
            node.next.prev = node.next;
        }
        size++;
    }

    public Iterator<T> iterator() {
        return null;
    }

    /**
     * Is this linked list is empty?
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * Return the size of this linked list
     * @return
     */
    public int size(){
        return size;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> trav = head;
        while(trav != null){
            sb.append(trav.data + ", ");
            trav = trav.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
