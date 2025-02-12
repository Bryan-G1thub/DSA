package medium;
import java.util.*;
public class medium49 {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        groupAnagrams(strs);
    }   
    public static List<List<String>> groupAnagrams(String[] strs){

        HashMap <String, Boolean> map = new HashMap<>();

        List<List<String>> groupedAnagrams = new ArrayList<>();
        
        for(int i = 0; i < strs.length-1; i++){

            for(int j = 0; j < strs.length-1; j++){

            char[] chars = strs[i].toCharArray();

            Arrays.sort(chars);

            String anagramCheck = new String(chars);

            groupedAnagrams.add(new ArrayList<>());

                if(!map.containsKey(anagramCheck)){

                map.put(anagramCheck, true); 

                groupedAnagrams.get(i).add(strs[j]);

            }
            
        }

        }
                System.out.println(groupedAnagrams);
                return groupedAnagrams;
    }
}