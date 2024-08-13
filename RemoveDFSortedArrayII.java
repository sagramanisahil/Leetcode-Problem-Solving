class RemoveDFSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }

        int j = 2;
        for(int i=2; i<n; i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String args[]){
        RemoveDFSortedArrayII sol = new RemoveDFSortedArrayII();
        int nums[] = {1,1,1,2,2,3};

        int result = sol.removeDuplicates(nums);
        System.out.print(result);
    }
}