public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while (slow != fast);
        
        return slow == 1;
    }
    
    private int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        
        HappyNumber solution = new HappyNumber();
        boolean isHappy = solution.isHappy(n);
        
        if (isHappy) {
            System.out.println(n + " is a happy number.");
        } else {
            System.out.println(n + " is not a happy number.");
        }
    }
}
