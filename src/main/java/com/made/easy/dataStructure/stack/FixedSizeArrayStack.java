package com.made.easy.dataStructure.stack;

/*
 *    In Stack, the order in which data arrives is important. The pile of plates of a cafeteria is a good example of stack. The plates
 *    are added to the stack as they are cleaned. They are placed on the top. When a plate is required it is taken from the top
 *    of the stack. The first plate placed on the stack is the last one to be used.
 *
 *    A stack is an ordered list in which insertion and deletion are done at one end, called as top. The last element inserted is the first
 *    one to be deleted. Hence, it is called Last in First out (LIFO).
 *
 *     ----------------------------------------------------------------
 *     | Space Complexity (for n push operation)        |     O(n)     |
 *     | Time Complexity of push()                      |     O(1)     |
 *     | Time Complexity of pop()                       |     O(1)     |
 *     | Time Complexity of size()                      |     O(1)     |
 *     | Time Complexity of isEmpty()                   |     O(1)     |
 *     | Time Complexity of isFullStack()               |     O(1)     |
 *     | Time Complexity of deleteStack()               |     O(1)     |
 *     -----------------------------------------------------------------
 */

public class FixedSizeArrayStack {

    //Length of the array used to implement the stack
    protected int capacity;

    //Default array capacity
    public static final int CAPACITY = 10;

    //Array used to implement the stack
    protected int[] stackRep;

    //Index of the top element of the stack in the array
    protected int top = -1;

    //Initialize the stack to use an array of default length
    public FixedSizeArrayStack(){
        this(CAPACITY);
    }
    
    //Initialize the stack to use an array of given length
    public FixedSizeArrayStack(int cap){
        this.capacity = cap;
        stackRep = new int[capacity];
    }

    //Returns the number of elements in the stack. This method runs in o(1) time
    public int size(){
        return (top + 1);
    }

    //Tests whether the stack is empty. This method runs in o(1) time.
    public boolean isEmpty(){
        return (top < 0);
    }

    //Test whether the stack is full. This method runs in o(1) time
    public boolean isFullStack(){
        return (size()== capacity);
    }

    //Insert an element at the top of the stack. This method runs in o(1) time
    public void push(int data) throws Exception{
        if(isFullStack()){
            throw new Exception("Stack is full.");
        }
        stackRep[++top] = data;
    }

    //Inspects the element at the top of the stack. This method runs in o(1) times
    public int top() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return stackRep[top];
    }

    //Removed the top elements from the stack. This method runs in o(1) times
    public int pop() throws Exception{
        int data;
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE;
        return data;
    }

    @Override
    public String toString() {
        String s;
        s = "[";
        if(size() > 0){
            s += stackRep[0];
        }
        if(size() > 1){
            for(int i = 1; i <= size() - 1; i++){
                s += ", " + stackRep[i];
            }
        }
        return s + "]";
    }

    public static void main(String[] args) throws Exception{
        FixedSizeArrayStack stack = new FixedSizeArrayStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        System.out.println("Size of stack: "+stack.size());

        System.out.println("Popint the element in LIFO manner: "+stack.pop());
    }
}
