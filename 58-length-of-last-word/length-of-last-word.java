class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");

        int res = words[words.length-1].length();

        return res;
    }
}