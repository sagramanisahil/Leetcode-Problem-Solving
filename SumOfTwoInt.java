class SumOfTwoInt {
    public int getSum(int a, int b) {
        while (b != 0) {
            int c = a & b;
            a = a ^ b; 
            b = c << 1; 
        }
        return a;
    }

    public static void main(String[] args) {
        SumOfTwoInt sol = new SumOfTwoInt();
        System.out.println("Sum of 1 and 2 is: " + sol.getSum(1, 2));
        System.out.println("Sum of -2 and 3 is: " + sol.getSum(-2, 3));
        
    }
}
