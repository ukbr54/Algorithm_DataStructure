package com.made.easy.dataStructure.stack.problems;

/**
 *
 *  Design a stack such that getMinimum() should be O(1).
 *  In this case, we are pushing the data in the elementStack and minStack also for every element. So the space complexity is O(n).
 * Time Complexity : O(1);
 * Space Complexity : O(n)
 */

class AdvancedStack extends Stack<Integer>{

    private Stack<Integer> elementStack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    @Override
    public void push(Integer o) throws Exception {
       elementStack.push(o);
       if(minStack.isEmpty() || minStack.peek() >= o){
           minStack.push(o);
       }else{
           minStack.push(minStack.peek());
       }
    }

    @Override
    public Integer pop() throws Exception {
        if(elementStack.isEmpty()){
            throw new Exception("Stack is empty");
        }
        minStack.pop();
        return elementStack.pop();
    }

    public int getMinimum() throws Exception {
        return minStack.peek();
    }
}

public class P6_MinimumElement {

    public static void main(String[] args) throws Exception {
        AdvancedStack stack = new AdvancedStack();
        stack.push(2);
        stack.push(6);
        stack.push(4);
        stack.push(1);
        stack.push(5);

        System.out.println("Minimum: "+stack.getMinimum());
        System.out.println("Pop: "+stack.pop());
        System.out.println("Minimum: "+stack.getMinimum());

    }
}
