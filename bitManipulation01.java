import java.util.*;

public class bitManipulation01 {

    public static void operators(){
         //perform bit wise & operator
        System.out.println(5&6);

        //perform bit wise OR operator
        System.out.println(5|6);

        //perform bit wise XOR operator
        System.out.println(5^6);

        //NOT operator used for 1's complement
        System.out.println(~5);

        //Left shift operator "<<"
        System.out.println(5<<2);

        //right shift operator ">>"
        System.out.println(6>>1);


        // "&&" checks AND condition
        // "||" checks OR condition
    }
    public static void main(String[] args) {
        operators();
    }
}
