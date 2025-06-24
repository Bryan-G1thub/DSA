package easy;

import java.util.Stack;

public class Implement_Queue_using_Stacks_232 {
    public static void main(String[] args) {

    }
    public static class MyQueue{
        private Stack<Integer> STACK;
        private Stack<Integer> REVERESED_STACK;

        public MyQueue(){
            STACK = new Stack<>();
            REVERESED_STACK = new Stack<>();
        }
        public void push(int x){

            TOP.push(x);

        }
        public int peek(){

        return -1;
        }
        public boolean empty(){

        return false;
        }
    }
}
