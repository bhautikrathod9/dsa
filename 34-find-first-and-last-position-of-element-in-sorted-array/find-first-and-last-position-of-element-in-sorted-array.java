class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        helperfo(nums, 0, target, result);
        helperlo(nums, nums.length-1, target, result);

        return result;
    }

    public void helperfo(int[] nums, int i, int target, int[] result){
        if(nums.length == i){
            result[0] = -1;
            return;
        }

        if(nums[i] == target){
            result[0] = i;
            return;
        }

        helperfo(nums, i+1, target, result);
    }

    public void helperlo(int[] nums, int i, int target, int[] result){
        if(i < 0){
            result[1] = -1;
            return;
        }

        if(nums[i] == target){
            result[1] = i;
            return;
        }

        helperlo(nums, i-1, target, result);
    }

    
}