//
import java.util.Arrays;
public class easy14{
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "fligt"};
        System.out.println(Solution(strs));;
    }
    public static String Solution(String[] strs){
        String prefix = strs[0];
        for(int i =1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);}
        }
        return prefix;
    }
}