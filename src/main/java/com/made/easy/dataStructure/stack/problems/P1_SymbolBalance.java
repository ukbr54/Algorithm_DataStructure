package com.made.easy.dataStructure.stack.problems;


public class P1_SymbolBalance {
    /**
     * Time Complexity: O(n). Since, we are scanning the input only once. Space Complexity: O(n) [For stack]
     *
     * @param s
     * @return boolean
     * @throws Exception
     */

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
