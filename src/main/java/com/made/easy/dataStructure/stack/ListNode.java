package com.made.easy.dataStructure.stack;

public class ListNode {

    public ListNode next;
    public int data;

    //Create an empty node
    public ListNode(){
      this.next = null;
      this.data = Integer.MIN_VALUE;
    }

    //create a node storing a specified data
    public ListNode(int data){
        this.next = null;
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return Integer.toString(this.data);
    }
}
