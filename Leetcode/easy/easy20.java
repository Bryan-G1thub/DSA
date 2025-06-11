package easy;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class easy20 {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(validParenthesisCheck(s));
    }
    public static boolean validParenthesisCheck(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put( '(', ')');
        map.put( '[', ']');
        map.put( '{', '}');
        if (s.length() % 2 != 0) return false;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                stack.push(c);
            } else if (map.containsValue(c)){
                if(stack.isEmpty() || map.get(stack.pop())!=c){
                    return false;
                }
                
            }

        }   
        return stack.isEmpty();
    }
}