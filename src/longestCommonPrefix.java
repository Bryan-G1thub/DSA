public class longestCommonPrefix{
    public static void main(String[] args) {
        String[] strs = {"flower", "flow"};
        System.out.println(Solution(strs));
    }
    public static String Solution(String[] strs){
        StringBuilder sb = new StringBuilder();
        char c;
        for(int i  = 0; i<= strs[0].length()-1; i++){//loop flower
            sb.append(strs[0].charAt(i));
            for(int j = 1; j<= strs.length-1; j++){//loop strs[]
                    
                c = (strs[0].charAt(i));
                    //if i > length of string j, break
                if(i>strs[j].length()-1){
                        sb.deleteCharAt(i);
                        String answer = sb.toString();
                        return answer;
                    }

                    //if character at strs[j] index i, is not == c
                    else if(strs[j].charAt(i) != c){
                        sb.deleteCharAt(i);
                        String answer = sb.toString();
                        return answer;
                    }
                }
            }
        }
}