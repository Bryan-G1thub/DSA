package medium;
import java.util.*;
public class medium49 {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops ","cat","stop","hat"};
        groupAnagrams(strs);
    }   
    public static List<List<String>> groupAnagrams(String[] strs){

        HashMap <String, Boolean> map = new HashMap<>();

        //1. create the return List<List<String>>
        List<List<String>> groupedAnagrams = new ArrayList<>();
        
        //2. loop the given strs
        for(int i = 0; i < strs.length; i++){

            //3. strs[i] -> char[]
            char[] chars = strs[i].toCharArray();

            //4. sort it
            Arrays.sort(chars);

            //5. convert back into string
            String anagramCheck = new String(chars);

            //6. check if the sort of this string has already been seen
            if(!map.containsKey(strs[i])){
            //NO: put the sorted string into map
            map.put(anagramCheck, true); 
            groupedAnagrams.get(i).add(strs[i]);
            }
            
        }
                System.out.println(groupedAnagrams);
                return groupedAnagrams;
    }
}