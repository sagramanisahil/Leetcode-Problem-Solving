class SortedArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int[] sortedArray = new int[nums.length];
        int evenIndex = 0;
        int oddIndex =  1;

        for (int num : nums) {
            if (num % 2 == 0) {
                sortedArray[evenIndex] = num;
                evenIndex+=2;
            } else {
                sortedArray[oddIndex] = num;
                oddIndex += 2;
            }
        }

        return sortedArray;
    }
}