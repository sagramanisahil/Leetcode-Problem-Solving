class NietherMinNorMax{
    public int findNonMinOrMax(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for(int num : nums){
            minimum = Math.min(minimum, num);
            maximum = Math.max(maximum, num);
        }
        for(int num : nums){
            if(num != minimum && num != maximum){
                return num;
            }
        }
        return -1;
    }
}