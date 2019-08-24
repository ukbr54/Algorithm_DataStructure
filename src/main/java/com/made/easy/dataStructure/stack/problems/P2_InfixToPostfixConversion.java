package com.made.easy.dataStructure.stack.problems;

/**
 * Algorithm for Infix to postfix Conversion:
 *  Example: a + b * c
 *  Step 1: If the character is operand add into the result.
 *  Step 2: If the character is operator
 *     a) First Check if the stack is empty or not, if it is empty then push the character in the stack.
 *     b) If the stack is not empty and consider second operator is coming then:
 *        i) if the precedence of second character is more then push the character in the stack.
 *        ii) if the precedence of first character is more then pop the first and push the second in stack.
 */
public class P2_InfixToPostfixConversion {
    static int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*' :
            case '/' :
                return 2;
            case '^' :
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception{
        String s = "A*B-(C+D)+E";
        //String s = "a+b*c";
        String result = new String("");
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            final char c = s.charAt(i);

            //If the Scanned character is operand, add it to output
            if(Character.isLetterOrDigit(c)){
                result += c;
            }
            // If the Scanned Character is '(', push in the stack
            else if(c == '('){
                stack.push(c);
            }
            //If the scanned character is ')', pop and output from the stack until an '(' is encountered.
            else if(c == ')'){
               while(!stack.isEmpty() && stack.peek() != '('){
                   result += stack.pop();
               }
               if(!stack.isEmpty() && stack.peek() == '('){
                   stack.pop();
               }
            }
            //an operator is encountered
            else{
               while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){
                   result += stack.pop();
               }
               stack.push(c);
            }
        }
        // pop all the operators from the stack
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        System.out.println(result);
    }
}
