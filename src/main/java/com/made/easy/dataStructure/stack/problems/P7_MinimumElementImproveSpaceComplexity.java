package com.made.easy.dataStructure.stack.problems;


class AdvancedImproveSpaceStack extends Stack<Integer>{
    private Stack<Integer> elementStack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    @Override
    public void push(Integer o) throws Exception {
        elementStack.push(o);
        if(minStack.isEmpty() || minStack.peek() >= o) minStack.push(o);
    }

    @Override
    public Integer pop() throws Exception {
        if(elementStack.isEmpty()){
            throw new Exception("Stack is empty");
        }
        final Integer data = elementStack.pop();
        if(data == minStack.peek()) minStack.pop();
        return data;
    }

    public int getMinimum() throws Exception {
        return minStack.peek();
    }
}

public class P7_MinimumElementImproveSpaceComplexity {

    public static void main(String[] args) throws Exception {
        AdvancedImproveSpaceStack stack = new AdvancedImproveSpaceStack();
        stack.push(2);
        stack.push(6);
        stack.push(4);
        stack.push(1);
        stack.push(5);
        stack.push(1);

        System.out.println("Minimum: "+stack.getMinimum());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Minimum: "+stack.getMinimum());
    }
}
