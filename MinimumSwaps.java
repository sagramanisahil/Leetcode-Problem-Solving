class MinimumSwaps {
    public int minSwaps(int[] nums) {
        int totalOnes =0; 
        int n = nums.length;
        for(int i=0; i<n; i++){
            totalOnes+=nums[i];
        }
        int a = 0;
        for(int i=0; i<totalOnes; i++){
            a += nums[i];
        }
        int min = totalOnes-a;
        for(int i=0; i<n; i++){
            a -= nums[i];
            a += nums[(i+totalOnes)%n];
            min = Math.min(min, totalOnes-a);
        }
        return min;
    }
    public static void main(String args[]){
        MinimumSwaps sol = new MinimumSwaps();
        int nums[]= {0,1,0,1,1,0,0};
        int result = sol.minSwaps(nums);
        System.out.print(result);
    }
}