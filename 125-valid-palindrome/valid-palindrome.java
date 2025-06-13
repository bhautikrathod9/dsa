class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String newStr = str.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder sb = new StringBuilder(newStr);
        sb.reverse();

        String revStr = sb.toString();

        if(newStr.equals(revStr)){
            return true;
        }else{
            return false;
        }
    }
}