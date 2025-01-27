import java.lang.Math;
import java.util.Scanner;

public class areaOfCircle {
    static float findArea(float r){
        return (float)(Math.PI * r * r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle: ");
        float r = sc.nextFloat();

        System.out.printf("The area of circle is: %.5f%n", findArea(r));

        sc.close();
    }
}
