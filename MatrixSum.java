class MatrixSum {
    public int matrixSum(int[][] nums) {
        int score = 0;
        for(int i=0; i<nums.length; i++){
            Arrays.sort(nums[i]);
        }
        for(int i=0; i<nums[0].length; i++){
            int maximum = 0;
            for(int j=0; j<nums.length; j++){
                maximum = Math.max(maximum, nums[j][i]);
            }
            score += maximum;
        }
        return score;
    }
}