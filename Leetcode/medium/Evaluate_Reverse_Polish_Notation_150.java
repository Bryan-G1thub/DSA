package medium;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation_150 {
    public static void main(String[] args) {
    String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
    System.out.println(evalRPN(tokens));
    }   
    public static int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(token.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            }
            else if(token.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            }
            else if(token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            }
            else if(token.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            }
            else{
            int intToken = Integer.parseInt(token);
            stack.push(intToken);
            }
        }
        return stack.pop();;
    }
}
