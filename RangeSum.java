import java.util.Arrays;
class RangeSum {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        int[] subarraySums = new int[n * (n + 1) / 2];
        int index = 0;
        
        // Generate all subarray sums
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = (sum + nums[j]) % mod;
                subarraySums[index++] = sum;
            }
        }
        // Sort the subarray sums
        Arrays.sort(subarraySums);
        // Calculate the sum of elements from left to right
        int result = 0;
        for (int i = left - 1; i < right; i++) {
            result = (result + subarraySums[i]) % mod;
        }
        return result;
    }
    public static void main(String args[]){
        RangeSum m = new RangeSum();
        int nums[]= {1,2,3,4};
        int n=4;
        int left = 1;
        int right = 5;
        
        int result = m.rangeSum(nums,n,left,right);
        System.out.print(result);
    }
}
