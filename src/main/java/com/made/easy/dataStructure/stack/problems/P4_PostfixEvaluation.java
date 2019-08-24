package com.made.easy.dataStructure.stack.problems;

public class P4_PostfixEvaluation {

    public static int expressionEvaluation(String[] tokens) throws Exception {
        int result = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<Integer>();
        for(String token : tokens){
           if(token == "+"){
               int operand1 = stack.pop();
               int operand2 = stack.pop();
               result = operand2 + operand1;
               stack.push(result);
           }else if(token == "*"){
               int operand1 = stack.pop();
               int operand2 = stack.pop();
               result = operand2 * operand1;
               stack.push(result);
           }else if(token == "-") {
               int operand1 = stack.pop();
               int operand2 = stack.pop();
               result = operand2 - operand1;
               stack.push(result);
           }else if(token == "/"){
               int operand1 = stack.pop();
               int operand2 = stack.pop();
               result = operand2 / operand1;
               stack.push(result);
           }else{
               stack.push(Integer.parseInt(token));
           }
        }
        return stack.pop();
    }

    public static void main(String[] args) throws Exception {
        String[] postfixExpression = {"1","2","3","*","+","5","-"};
        System.out.println("Result: "+expressionEvaluation(postfixExpression));
    }
}
