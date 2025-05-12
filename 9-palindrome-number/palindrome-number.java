class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        int digit = 0;
        while(x>0){
            digit = x % 10;
            rev = rev*10 + digit;
            x /= 10;
        }

        return temp == rev;
    }
}