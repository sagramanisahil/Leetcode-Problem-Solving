class TriangleNumber {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int answer = 0;
        for(int i=nums.length-1; i>=2; i--){
            int start = 0;
            int end = i-1;

            while(start < end){
                if(nums[start] + nums[end] > nums[i]){
                    answer += (end - start);
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return answer;   
    }
}