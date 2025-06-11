public class bitManipulation02 {

    public static void checkEvenOrOdd(int n){
        int lsb = n&1;

        if(lsb == 1){
            System.out.println("Odd number");
        }else{
            System.out.println("Even number");
        }
    }

    public static void getIthBit(int n, int i){
        int bitMask = 1<<i;

        if((n & bitMask) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }

    public static void setIthBit(int n, int i){
        int bitMask = 1<<i;

        System.out.println(n | bitMask);
    }

    public static void clearIthBit(int n, int i){
        int bitMask = ~(1<<i);

        System.out.println(n&bitMask);
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return n & ~(1<<i);
        // }else{
        //     return n | (1<<i);
        // }

        n = n & ~(1<<i);
        return n | (newBit<<i);
    }

    public static int clearIthBits(int n, int i){
        int bitMask = -1<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBits(15, 2));
    }
}
