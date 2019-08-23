package com.made.easy.dataStructure.stack.problems;

import java.util.Arrays;

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

public class P1_SymbolBalance {

    public static boolean isValidSymbolPattern(String s) throws Exception{
        Stack<Character> stack = new Stack<Character>();
        if(s == null || s.length() == 0){
            return true;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')'){
               if(!stack.isEmpty() && stack.peek() == '('){
                   stack.pop();
               }else{
                   return false;
               }
            }else if(s.charAt(i) == ']'){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i) == '}'){
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws Exception{
        final String input = "()(()[()])";
        System.out.println(isValidSymbolPattern(input));
    }
}
