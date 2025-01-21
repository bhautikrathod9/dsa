import java.util.Arrays;

public class arithmaticProgresion {
    static boolean checkIsAp(int arr[], int n){

        if( n == 1 ){
            return true;
        }

        Arrays.sort(arr);

        int d = arr[1] - arr[0];
        for(int i = 2; i < n; i++){
            if( arr[i] - arr[i-1] != d ){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        int[] array = {3,9,15,12,5};

        int n = array.length;

        if(checkIsAp(array, n)){
            System.out.println("the array form an arithmatic progression");
        }else{
            System.out.println(("The array doesn't form an arithmatic progresion"));
        }   
    }
}
