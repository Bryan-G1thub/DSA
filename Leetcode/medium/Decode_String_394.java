package medium;

import java.util.Stack;

public class Decode_String_394 {
    public static void main(String[] args) {
        String input = "322";
        System.out.println(decodeStirng(input));
    }
    public static String decodeStirng(String input){
        int currentNum = 0;
        String currentStr = "";
        Stack <String> strStack = new Stack<>(); 
        Stack <Integer> numStack = new Stack<>(); 
        for(char c: input.toCharArray()){
            if(Character.isDigit(c)){
                currentNum = currentNum * 10 + (c - '0');
            }
            else if(c=='['){ 
                strStack.push(currentStr);
                numStack.push(currentNum);
                currentNum = 0;
                currentStr = "";   
            }
            else if(c==']'){
                //pop from both stacks
                //currentStr = lastStr + currentStr * num
            }
            else {
                //Normal character, append to currentStr
            }
        }
        return null;
    }
}
