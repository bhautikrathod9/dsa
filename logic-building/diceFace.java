// Java program for the above approach
import java.util.Scanner;

class GfG {
  
    static void oppositeFaceOfDice(int n)  {
      
        // Stores number on opposite face
        // of dice
        int ans = 7 - n;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any dice side : ");
        int n = sc.nextInt();
        oppositeFaceOfDice(n);
    }
}