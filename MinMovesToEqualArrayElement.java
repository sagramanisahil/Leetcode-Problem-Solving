class MinMovesToEqualArrayElement{
   public int minMoves(int[] nums) {
       Arrays.sort(nums);
        int x =0;
        for(int i=0; i<nums.length; i++){
            int y = -1 * (nums[0] - nums[i]);
            x = x + y;
        }
        return x;
    }
}