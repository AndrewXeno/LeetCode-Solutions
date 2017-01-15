package LeetCodeSolutions;

import java.util.Stack;

/**
 * Created by AndrewX on 2017/1/15.
 * Remember to use stack for checking parentheses pairs.
 */
public class Q20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(char c: s.toCharArray()){
            if(isOpen(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()||!isMatched(stack.pop(), c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpen(char c){
        if (c=='('||c=='['||c=='{'){
            return true;
        }
        return false;
    }

    private static boolean isMatched(char c1, char c2){
        if (c1=='(' && c2==')'){
            return true;
        }
        if (c1=='[' && c2==']'){
            return true;
        }
        if (c1=='{' && c2=='}'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("[(())]"));
    }
}
