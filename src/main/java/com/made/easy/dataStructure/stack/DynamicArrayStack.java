package com.made.easy.dataStructure.stack;

/**
 *
 *
 *      If the arry is full, create a new array of twice the size, and copy items.With this approach, pushing n items takes time
 *      proportional to n.
 *
 *        ---------------------------------------------------------------
 *       | Space Complexity (for n push operation)          |   O(n)    |
 *       | Time Complexity of create stack: DynArrayStack   |   O(1)    |
 *       | Time Complexity of push()                        |   O(1)    |
 *       | Time Complexity of pop()                         |   O(1)    |
 *       | Time Complexity of top()                         |   O(1)    |
 *       | Time Complexity of isEmpty()                     |   O(1)    |
 *       | Time Complexity of isStackFull()                 |   O(1)    |
 *       | Time Complexity of deleteStack()                 |   O(1)    |
 *       -----------------------------------------------------------------
 *
 *
 *       Too many doublings may cause memory overflow exception.
 */

public class DynamicArrayStack {

    //Length of the array used to implement the stack.
    protected int capacity;

    //Default array capacity
    public static final int CAPACITY = 8; // Power of 2
    public static int MIN_CAPACITY = 16; // Power of 2

    //Array used to implement stack
    protected int[] stackRep;

    //Index of the top element of the stack in the array.
    protected int top = -1;

    //Initialize the stack to use an array of default length
    public DynamicArrayStack(){
        this(CAPACITY);
    }

    //Initialize the stack to use an array of given length
    public DynamicArrayStack(int cap){
        this.capacity = cap;
        stackRep = new int[capacity];
    }

    //Return the number of element in the stack. This method runs in O(1) time.
    public int size(){
        return (top + 1);
    }

    //check whether the stack is empty. This method runs in O(1) time.
    public boolean isEmpty(){
        return (top < 0);
    }

    //Inspect the element at the top of stacks. This method run in O(1) time.
    public int top() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return stackRep[top];
    }

    //Insert an element at the top of the stack. This method run in O(1) time.
    public void push(int data){
        if(size() == capacity){
            expand();
        }
        stackRep[++top] = data;
    }

    //Increase the stack size by double
    private void expand(){
      int length = size();
      int[] newStack = new int[length << 1]; //or 2 * length
      System.arraycopy(stackRep,0,newStack,0,length);
      stackRep = newStack;
      this.capacity = capacity << 1;
    }

    //Removes the top element from the stack. This method runs in O(1) times
    public int pop() throws Exception{
        int data;
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE;
        shrink();
        return data;
    }

    // dynamic array operation: shrinks to 1/2 if more than than 3/4 empty
    @SuppressWarnings("unused")
    private void shrink() {
        int length = size();
        if(top > 0 && (top + 1) == (stackRep.length / 4)){
            int[] newStack = new int[stackRep.length / 2];
            System.arraycopy(stackRep,0,newStack,0,length);
            stackRep = newStack;
        }
        return;
    }

    public String toString() {
        String s;
        s = "[";
        if (size() > 0)
            s += stackRep[0];
        if (size() > 1)
            for (int i = 1; i <= size() - 1; i++) {
                s += ", " + stackRep[i];
            }
        return s + "]";
    }

    public static void main(String[] args) throws Exception {
        DynamicArrayStack stack  = new DynamicArrayStack();
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: "+stack);

        stack.pop();
    }
}
