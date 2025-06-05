package easy;
/*TWO SUM COMPLETED O(n)*/

import java.util.*;
public class easy1{
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum0(nums, target);
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp = target-nums[i];
            if(map.containsKey(temp)){
                return new int[] {i, map.get(temp)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}