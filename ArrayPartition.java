class ArrayPartition{
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;

        for(int i=0; i<nums.length; i+=2){
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String args[]){
        ArrayPartition sol = new ArrayPartition();

        int nums[] = {1,4,3,2};
        int result = sol.arrayPairSum(nums);

        System.out.print("Result is : " + result);
    }
}