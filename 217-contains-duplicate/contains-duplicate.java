class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=1; i<nums.length; i++){
        //     int curr = nums[i];
        //     int prev = i-1;

        //     while(prev>=0 && nums[prev]>curr){
        //         nums[prev+1] = nums[prev];
        //         prev--;
        //     }

        //     nums[prev+1] = curr;
        // }
        Arrays.sort(nums);

        boolean flag = false;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                flag = true;
                return flag;
            }
        }

        return flag;
    }
}