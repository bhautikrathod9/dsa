// Java program to find opposite face of dice
class Dice {
    static int oppositeFaceOfDice(int n) {
        if (n == 1) {
            System.out.println(6);
        } else if (n == 2) {
            System.out.println(5);
        } else if (n == 3) {
            System.out.println(4);
        } else if (n == 4) {
            System.out.println(3);
        } else if (n == 5) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 5;
        oppositeFaceOfDice(n);
    }
}