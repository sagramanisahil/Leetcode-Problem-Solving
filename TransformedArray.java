class TransformedArray {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                int t = (i + nums[i]) % n;
                result[i] = nums[t];
            }
            else if(nums[i] < 0){
                int target = (i + nums[i]) % n;
                if(target < 0){
                    target += n;
                }
                result[i] = nums[target];
            }
            else {
                result[i] = nums[i];
            }
        }
        return result;
    }
}