class SplitArray {
    public boolean isPossibleToSplit(int[] nums) {
        int[] count = new int[101];
        for(int i=0; i<nums.length; i++){
            count[nums[i]-1]++;
            if(count[nums[i]-1] > 2){
                return false;
            }
        }
        return true;
    }
}