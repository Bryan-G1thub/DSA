package easy;

import java.util.Stack;

public class Implement_Queue_using_Stacks_232 {
    public static void main(String[] args) {

    }
    public static class MyQueue{
        private Stack<Integer> STACK1; //enque
        private Stack<Integer> STACK2; //dequue

        public MyQueue(){
            STACK1 = new Stack<>();
            STACK2  = new Stack<>();
        }
        public void push(int x){
            STACK1.push(x);
        }
        public int pop(){
            if(STACK2.isEmpty()){
                while(!STACK1.isEmpty()){
                    STACK2.push(STACK1.pop());
                }
            }
                return STACK2.pop();    
        }
        public int peek(){
           if(STACK1.isEmpty()){
            while(!STACK1.isEmpty()){
                    STACK2.push(STACK1.pop());
               }
            }
            return STACK2.peek();
        }
        public boolean empty(){
            return STACK1.isEmpty() && STACK2.isEmpty();
        }
    }
}
