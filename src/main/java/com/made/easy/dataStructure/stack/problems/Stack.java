package com.made.easy.dataStructure.stack.problems;

class Stack<T>{

    private int capacity;
    private static final int CAPACITY = 10;
    protected Object[] elementData;
    private int top = -1;

    public Stack(){
        this(CAPACITY);
    }

    public Stack(int cap){
        this.capacity = cap;
        elementData = new Object[this.capacity];
    }

    public int size(){
        return (top + 1);
    }

    public boolean isEmpty(){
        return (top < 0);
    }

    public boolean isFullStack(){
        return size() == capacity;
    }

    public void push(T t)throws Exception{
        if(isFullStack()){
            throw new Exception("Stack is Full");
        }
        elementData[++top] = t;
    }

    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        final T o = (T)elementData[top];
        elementData[top--] = Integer.MIN_VALUE;
        return o;
    }

    public T peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        final T o = (T)elementData[top];
        return o;
    }

}