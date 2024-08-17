class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int temp = 0;
        for(int i=0; i<nums.length; i++){
            temp^=nums[i];
        }
        temp &= -temp;
        int result[] = new int [2];
        for(int n: nums){
            if((temp & n)==0){
                result[0]^=n;
            }
            else{
                result[1]^=n;
            }
        }
        return result;
    }
}