class Power {

    public static double myPow(double x, int n) {
        double result = 1.0;
        int a = Math.abs(n);

        for (int i = 0; i < a; i++) {
            result *= x;
        }

        if (n < 0) {
            result = 1.0 / result;
        }

        return result;
    }

    public static void main(String[] args) {
        double x = 2.0000;
        int n = 10;

        double result = myPow(x, n);
        System.out.println("The Answer is " + result);
    }
}
