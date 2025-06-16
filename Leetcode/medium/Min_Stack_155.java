package medium;

import java.util.Stack;

public class Min_Stack_155 {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
    }
}

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack = new Stack<>();
   

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    public void pop() {
        if(minStack.peek().equals(stack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}