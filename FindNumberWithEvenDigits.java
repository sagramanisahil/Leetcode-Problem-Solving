class FindNumberWithEvenDigits {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int element : nums){
            int noofdigits =0;
            while(element!=0)
            {
                noofdigits+=1;
                element/=10;
            }
            if(noofdigits%2==0)
            {
                count+=1;
            }
        }
        return count;
    }
}