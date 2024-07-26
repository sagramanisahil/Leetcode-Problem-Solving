public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        
        return ans;
    }

    public static void main(String[] args) {
       ConcatenationOfArray solution = new ConcatenationOfArray();
        int[] nums = {1, 2, 3, 4};
        int[] ans = solution.getConcatenation(nums);
        
        for (int num : ans) {
            System.out.print(num + " ");
        }
        
    }
}
