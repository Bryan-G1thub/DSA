package easy;
import java.util.*;
public class easy242 {
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(validAnagram(s, t));
    }
    public static boolean validAnagram(String s, String t){
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        if(Arrays.equals(sa, ta)){
            return true;
        } else{
            return false;
        }
    }
}