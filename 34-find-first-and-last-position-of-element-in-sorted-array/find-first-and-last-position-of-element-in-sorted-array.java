class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int[] result = new int[2];
        // helperfo(nums, 0, target, result);
        // helperlo(nums, nums.length-1, target, result);

        // return result;

        int n = nums.length;
        int firstIndex = -1;
        int lastIndex = -1;
        int low = 0;
        int high = n-1;
        // to find first position
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] > target) high = mid-1;
            else if(nums[mid] < target) low = mid+1;
            else {firstIndex = mid; high = mid-1;}
        }
        // reassinging 
        low = 0;
        high = n-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] > target) high = mid-1;
            else if(nums[mid] < target) low = mid+1;
            else {lastIndex = mid; low = mid+1;}
        }

        return new int[]{firstIndex , lastIndex};
    }

    // public void helperfo(int[] nums, int i, int target, int[] result){
    //     if(nums.length == i){
    //         result[0] = -1;
    //         return;
    //     }

    //     if(nums[i] == target){
    //         result[0] = i;
    //         return;
    //     }

    //     helperfo(nums, i+1, target, result);
    // }

    // public void helperlo(int[] nums, int i, int target, int[] result){
    //     if(i < 0){
    //         result[1] = -1;
    //         return;
    //     }

    //     if(nums[i] == target){
    //         result[1] = i;
    //         return;
    //     }

    //     helperlo(nums, i-1, target, result);
    // }
}