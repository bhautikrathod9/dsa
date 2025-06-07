class Solution {
    public int hammingWeight(int n) {
        if(n == 0){
            return 0;
        }

        return (n&1)+hammingWeight(n>>1);
    }
}