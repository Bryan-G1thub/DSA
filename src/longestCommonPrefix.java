import java.util.Arrays;

public class longestCommonPrefix{
    public static void main(String[] args) {
        String[] strs = {"flower", "flow"};
        Arrays.sort(strs);
        for(String word : strs){
            System.out.println(word);
        }
    }
    /*public static String Solution(String[] strs){
        Arrays.sort(strs);
        System.out.println(strs);
        */
    }