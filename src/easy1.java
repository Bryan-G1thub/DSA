import java.util.*;

public class easy1{
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution(nums, target);
    }
    public static int[] Solution(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            int temp = target-nums[i];
            if(map.containsKey(temp)){
                System.out.println(i);
                System.out.println(map.get(temp));

                return new int[] {i, map.get(temp)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}