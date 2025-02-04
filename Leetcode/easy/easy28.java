//Completed O(n*m) COULD STILL BE IMPROVED
public class easy28{
    public static void main(String[] args){
        String needle = "sad";
        String haystack = "aadnbutsad";
        System.out.println(Solution(needle, haystack));
    }
    public static int Solution(String needle, String haystack){
        for(int LEFT_CHAR_INDEX=0; LEFT_CHAR_INDEX<=haystack.length()-needle.length();LEFT_CHAR_INDEX++){
            if((haystack.substring(LEFT_CHAR_INDEX, LEFT_CHAR_INDEX + needle.length())).equals(needle)){
                return(LEFT_CHAR_INDEX);
            }
        }
        return -1;
    }
}