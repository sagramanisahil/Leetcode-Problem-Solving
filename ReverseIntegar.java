public class ReverseIntegar {
    public int reverse(int x) {
        int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            
            reversed = reversed * 10 + digit;
        }
        
        return reversed;
    }
    
    public static void main(String[] args) {
        ReverseIntegar solution = new ReverseIntegar();
        
        int x1 = 123;
        System.out.println("Reversed of " + x1 + ": " + solution.reverse(x1));
        
        int x2 = -123;
        System.out.println("Reversed of " + x2 + ": " + solution.reverse(x2));
        
        int x3 = 120;
        System.out.println("Reversed of " + x3 + ": " + solution.reverse(x3));
    }
}
