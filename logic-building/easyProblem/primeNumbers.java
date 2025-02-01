package easyProblem;

public class primeNumbers {
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        if( n == 2 || n == 3){
            return true;
        }

        if(n%2 == 0 || n%3 == 0){
            return false;
        }

        for(int i = 5; i <= Math.sqrt(n); i = i + 6){
            if(n%i == 0 || n%(i+2) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 121;
        if(isPrime(n)){
            System.out.println("The give number " + n + " is prime.");
        }else{
            System.out.println("The give number " + n + " is not prime.");
        }
    }
}
