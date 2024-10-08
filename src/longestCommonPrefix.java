class longestCommonPrefix{
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(Solution(strs));;
    }
    public static String Solution(String[] strs){
        
        StringBuilder prefix = new StringBuilder();
        for(int i = 0; i <= strs.length-1; i++){
                for(int j = 0; i<strs.length-1;i++){
                    if(strs[i].charAt(j) == strs[i+1].charAt(j)){
                        prefix.append(strs[i].charAt(j));
                    }
                    else{
                        break;
                    }
                }

        }
        String answer = prefix.toString(); 
        return answer;
    }
}