class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num;

        while(left <= right){
            int mid = (left+right)/2;

            long s = (long) mid * mid;

            if(s == num){
                return true;
            }
            else if(s > num){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return false;
    }
}