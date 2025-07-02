package easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.xml.sax.SAXNotRecognizedException;

public class Number_of_Students_Unable_to_Eat_Lunch_1700 {
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        countStudentsOPTIMIZED(students, sandwiches);
    }
    public static int countStudentsOPTIMIZED(int[] students, int[] sandwiches){
        Stack<Integer> SAMMICH_STACK = new Stack<>();
        Queue<Integer> STUDENT_QUEUE = new LinkedList<>();
        for(int s : students){
            STUDENT_QUEUE.add(s);
        }
        for(int i = sandwiches.length - 1; i>=0; i--){
            SAMMICH_STACK.add(sandwiches[i]);
        }
        int rotations = 0;
        while (!STUDENT_QUEUE.isEmpty() && !SAMMICH_STACK.isEmpty()){
            if (STUDENT_QUEUE.peek() == SAMMICH_STACK.peek()) {
                 STUDENT_QUEUE.poll();
                 SAMMICH_STACK.pop();
                 rotations = 0;
            }
            else{
                STUDENT_QUEUE.add(STUDENT_QUEUE.poll());
                rotations++;
            }
            if(rotations== STUDENT_QUEUE.size()){
                break;
            }
        }
        return STUDENT_QUEUE.size();
    }
}