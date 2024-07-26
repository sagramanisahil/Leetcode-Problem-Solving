class MissingNumber{
    public int missingNumber(int[] nums) {
        int n=0;

        for(int i=0; i<=nums.length; i++){
            n = n^i;
        }
        for(int num : nums){
            n = n^num;
        }
        return n;
    }
    public static void main(String args[]){
        MissingNumber s = new MissingNumber();

        int nums[]={3,0,1};

        int result = s.missingNumber(nums);
        System.out.println("The result is : " + result);
    }
}





/*class Main {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String args[]) {
        Main s = new Main();

        int nums[] = {3, 0, 1};

        int result = s.missingNumber(nums);

        System.out.println("The result is: " + result);
    }
}
*/