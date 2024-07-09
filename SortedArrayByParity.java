class SortedArrayByParity{
    public static int[] sortArrayByParity(int[] nums) {
        int[] sortedArray = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                sortedArray[evenIndex++] = num;
            } else {
                sortedArray[oddIndex--] = num;
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] sortedNums = sortArrayByParity(nums);
        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
    }
}
