class Solution {
    public int largestAltitude(int[] gain) {
        int[] al = new int[gain.length+1];

        al[0] = 0;
        for(int i=1; i<al.length; i++){
            al[i] = gain[i-1] + al[i-1];
        }

        Arrays.sort(al);

        return al[al.length - 1];
    }
}