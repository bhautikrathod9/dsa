public class geoSeriesSum {
    static float sumOfseries(float a, float r, float n){
        float sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + a;
            a = a * r;
        }

        return sum;
    }

    public static void main(String[] args) {
        float a = 2;
        float r = (float)(2.0);
        float n = 15;

        System.out.printf("Sum: %.2f\n", sumOfseries(a, r, n));
    }
}
