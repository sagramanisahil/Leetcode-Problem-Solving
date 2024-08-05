class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i=0; 
        for(int j=0; j < nums.length; j++){
            if(nums[j]!=val){
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]= temp;
                i++;
            }
        }
        return i;
    }
    public static void main(String args[]){
        RemoveElement sol = new RemoveElement();
        int nums[]= {3,2,2,3};
        int val = 3;

        int result = sol.removeElement(nums,val);
        System.out.print(result);
    }
}