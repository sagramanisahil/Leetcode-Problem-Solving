class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 1;
        int n = nums[0];
        for(int i=1; i < nums.length; i++ ){
            if(nums[i]==n){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                n = nums[i];
                count=1;
            }
        }
        return n;
    }
    public static void main(String args[]){
        MajorityElement s = new MajorityElement();
        int nums[] = {3,2,3};
        int result = s.majorityElement(nums);
        System.out.print(result);
    }
}