class ContainDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j <= i+k && j < nums.length; j++){
            if(nums[i]==nums[j]){
                return true;
            }
        }
    }
        return false;
}
    public static void main(String args[]){
        ContainDuplicateII sol = new ContainDuplicateII();
        int nums[] = {1,2,3,1};
        int k = 3;
        boolean result = sol.containsNearbyDuplicate(nums,k);
        System.out.print(result);
    }
}