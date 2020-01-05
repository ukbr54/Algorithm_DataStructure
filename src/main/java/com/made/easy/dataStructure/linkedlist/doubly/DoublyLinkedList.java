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
}
