class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        LinkedList<Integer> list = new LinkedList<>();

        Arrays.sort(nums);

        // int left = 0, right = nums.length - 1;

        // while(left < right){
        //     int mid = left + (right - left)/2;

        //     if(mid == target){
        //         list.add(mid);
        //     }else if(mid > target){
        //         left = mid + 1;
        //     }else {
        //         right = mid - 1;
        //     }
        // }

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        return list;
    }
}