package com.made.easy.dataStructure.stack.problems;

/**
 * 1. Traverse the list till we encounter X as input element.
 * 2. During the traversal push all the elements (Until X) on to the stack.
 * 3. For the second half of the list, compare each elements content with top of the stack. If they are same then pop the stack and go
 *    to the next element in the input list.
 * 4. If they are not same then the given string is not a palindrome.
 * 5. continue the process until the stack is empty or the string is not a palindrome.
 */
public class P10_IsPalindromeUsingStack {

    public static boolean isPalindrome(String input) throws Exception {
        Stack<Character> stack = new Stack<Character>();
        char[] inputChar = input.toCharArray();
        int i = 0;
        while(inputChar[i] != 'X'){
            stack.push(inputChar[i]);
            i++;
        }
        i++; //for X
        while(inputChar.length > i){
           if(stack.isEmpty()) return false;
           if(stack.pop() != inputChar[i]) return false;
           i++;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome("ababXbaba"));
    }
}
