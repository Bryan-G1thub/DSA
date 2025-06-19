package medium;

import java.util.Stack;

public class Decode_String_394 {
    public static void main(String[] args) {
        String input = "21[abc]3[cd]ef";
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
                int count = numStack.pop();
                String lastStr = strStack.pop();
                StringBuilder temp = new StringBuilder(lastStr);
                temp.append(currentStr.repeat(count));
                currentStr = temp.toString();
            }
            else {
                currentStr += c;
            }
        }
        return currentStr;
    }
}
