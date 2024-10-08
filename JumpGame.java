class JumpGame {
    public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        for(int i = nums.length-2 ; i >= 0; i--){
            if(i+nums[i] >= goal){
                goal = i;
            }
        }
        return goal==0;
    }
    public static void main(String args[]){
       JumpGame sol = new JumpGame();
        int nums[]= {2,3,1,1,4};

        boolean result = sol.canJump(nums);
        System.out.print(result);
    }
}