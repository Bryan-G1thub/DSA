/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.*/

package easy;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class easy20 {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(validPaenthesisCheck(s));
    }
    public static boolean validPaenthesisCheck(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put( '(', ')');
        map.put( '[', ']');
        map.put( '{', '}');
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                stack.push(c);
            }
            if(map.containsValue(c)){
                if(map.get(stack.get(stack.size()-1))==c){
                    stack.pop();
                }
                else{return false;}
            }

        }   
        return true;
    }
}