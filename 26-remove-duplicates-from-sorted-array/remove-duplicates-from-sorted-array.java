import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        int k = 0;

        for(int i=0; i<nums.length; i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}