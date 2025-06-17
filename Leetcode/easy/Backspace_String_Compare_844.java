package easy;

import java.util.Stack;

public class Backspace_String_Compare_844{
    public static void main(String args[]){
        String s = "y#fo##f";
        String t = "y#f#o##f";
        System.out.println(StringCompare(s, t));
    }
    public static boolean StringCompare(String s, String t){
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!sStack.isEmpty() && c=='#'){
                sStack.pop();
            }
            else if(c!='#'){sStack.push(c);}
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(!tStack.isEmpty() && c=='#'){
                tStack.pop();
            }
            else if(c!='#'){tStack.push(c);}
        }
        System.out.println(sStack);
        System.out.println(tStack);

        return sStack.equals(tStack);
    }
}