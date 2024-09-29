class FibanocciNumber {
    public int fib(int n) {
        int a = 0, b = 1, count = 2, c = 0;
        if (n == 0 || n == 1) {
            return n;
        }

        while (count <= n) {
            c = a + b;
            a = b;
            b = c;
            count++;
        }
        return c;
    }
    public static void main (String args[]){
        FibanocciNumber s = new FibanocciNumber();

        int result = s.fib(2);
        System.out.print("The result is : " + result);
    }
}