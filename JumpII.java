class JumpII {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= n - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
    public static void main(String args[]){
        JumpII sol = new JumpII();
        int nums[]= {2,3,1,1,4};
        
        int result = sol.jump(nums);
        System.out.print(result);
    }
}