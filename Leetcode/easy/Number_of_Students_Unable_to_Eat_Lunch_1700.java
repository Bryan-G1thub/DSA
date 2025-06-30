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
        for(int i = 0; i<students.length; i++){
            if(students[i]!=sandwiches[i]){
                STUDENT_QUEUE.add(students[i]);
                SAMMICH_STACK.add(sandwiches[sandwiches.length-1-i]);
            }
        }
        int rotations = 0;
        while (!STUDENT_QUEUE.isEmpty() && !SAMMICH_STACK.isEmpty()){
            if (STUDENT_QUEUE.peek() == SAMMICH_STACK.peek()) {
                 STUDENT_QUEUE.poll();
                 SAMMICH_STACK.pop();
                 rotations = 0;
            }
            else if()
        return STUDENT_QUEUE.size();
        }
    }
}