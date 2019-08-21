package com.made.easy.dataStructure.stack;

import java.util.EmptyStackException;

/**
 *
 *  Array Implementation:
 *   - Operation takes constant time.
 *   - Expensive doubling operation once in a while.
 *   - Any sequence of n operations (starting from the empty stack) -- "amortized" bound takes time proportional to n.
 *
 *
 *  Linked List Implementation:
 *   - Grows & shrinks gracefully.
 *   - Every operation takes constant time O(1).
 *   - Every operation uses extra space and time to deal with references.
 */

public class LinkedStack<T> {

    //indicates the size of the linked list
    private int length;
    private ListNode top;

    //Constructor: Creates an empty stack
    public LinkedStack(){
        this.length = 0;
        this.top = null;
    }

    //Adds the specified data to the top of this stack.
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.setNext(top);
        top = temp;
        length++;
    }

    //Remove the data at the top of this stack and returns a reference to it.
    public int pop() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int data = top.getData();
        top = top.getNext();
        length--;
        return data;
    }

    //Returns a reference to the data at the top of the stack.
    public int peek() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int data = top.getData();
        return data;
    }

    //Return true if the stack is empty otherwise false
    public boolean isEmpty(){
        return (length == 0);
    }

    //Returns the number of elements in the stack.
    public int size(){
        return length;
    }

    @Override
    public String toString() {
        String result = "";
        ListNode current = top;
        while(current != null){
            result = result + current.toString() + "\n";
            current = current.getNext();
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.toString());

        System.out.println("Peek: "+stack.peek());

        System.out.println("Pop: "+stack.pop());
    }
}
