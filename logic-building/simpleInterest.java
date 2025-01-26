class simpleInterest {
    static float simpleInterest(float p, float t, float r) {
        /* Calculate simple interest  */
        return (p * t * r) / 100;
    }

    public static void main(String[] args) {
        float p = 1, r = 1, t = 1;
        System.out.println(simpleInterest(p, r, t));
    }
}