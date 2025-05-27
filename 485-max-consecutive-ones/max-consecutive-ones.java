class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0;
        int maxCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                currCount = 0;
            }
            if(nums[i] == 1){
                currCount++;
            }

            if(currCount > maxCount){
                maxCount = currCount;
            }
        }

        return maxCount;
    }
}