class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int start = 0;
        int end = 0;

        for(int num : nums){
            end += num;
        }
        for(int i=0; i<nums.length; i++){
            end -= nums[i];
            if(end == start){
                return i;
            }
            else{
                start += nums[i];
            }
        }
        return -1;
    }
}