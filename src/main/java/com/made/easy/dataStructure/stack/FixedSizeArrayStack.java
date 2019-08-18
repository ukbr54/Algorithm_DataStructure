package com.made.easy.dataStructure.stack;

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

    //Insert an element at the top of the stack. This method runs in o(1) time
    public void push(int data) throws Exception{
        if(size() == CAPACITY){
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
