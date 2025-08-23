class Solution {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        
        for(int i=0; i<nums.length; i++){
            cs += nums[i];

            ms = Math.max(cs, ms);

            if(cs < 0){
                cs = 0;
            }
        }

        return ms;

        // int maxSum = Integer.MIN_VALUE;
        // int currSum = 0;
        
        // for(int i=0; i<nums.length; i++){
        //     currSum += nums[i];

        //     if(currSum > maxSum){
        //         maxSum = currSum;
        //     }
        //     if(currSum < 0){
        //         currSum = 0;
        //     }
        // }
        // return maxSum;
    }
}