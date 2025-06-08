class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        int j = k%n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, j-1);
        reverse(nums, j, n-1);

        // for(int i=0; i<k; i++){
        //     int le = nums[nums.length-1];
        //     for(int j=nums.length-1; j>0; j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = le;
        // }
    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}