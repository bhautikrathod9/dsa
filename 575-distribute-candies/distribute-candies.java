class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for(int i : candyType){
            set.add(i);
        }

        var n = candyType.length/2;

        if(set.size() >= n){
            return n;
        }else{
            return set.size();
        }
    }
}