package arrays;

import java.util.*;

class GfG {
    static ArrayList<Integer> getAlternates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
      
        // Iterate over all alternate elements
        for (int i = 0; i < arr.length; i += 2) {
            res.add(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        ArrayList<Integer> res = getAlternates(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
