package medium;
import java.util.*;
public class medium49 {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops ","cat","stop","hat"};
        groupAnagrams(strs);
    }   
    public static List<List<String>> groupAnagrams(String[] strs){
        //create the return List<List<String>>
        List<List<String>> groupedAnagrams = new ArrayList<>();
        
        //loop the given strs
        for(int i = 0; i <= strs.length; i++){

            //create a char[] of our current string
            char[] chars = strs[i].toCharArray();

            //sort the char[]
            Arrays.sort(chars);

            //

    return null;
        }
    }
}