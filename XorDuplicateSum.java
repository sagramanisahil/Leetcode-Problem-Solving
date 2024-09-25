class XorDuplicateSum {
    public int duplicateNumbersXOR(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    sum ^= nums[i];
                    break;
                }
            }
        }
        return sum;
    }
}