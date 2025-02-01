package easyProblem;
import java.util.Scanner;

class sumOfDigits{

    static int sum(int n){
        int sum = 0;
        while(n != 0){
            int last = n%10;

            sum += last;

            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n = sc.nextInt();

        System.out.println("The sum of digits : " + sum(n));

        sc.close();
    }
}