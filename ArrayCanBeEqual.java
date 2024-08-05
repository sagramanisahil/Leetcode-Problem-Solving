class ArrayCanBeEqual {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length){
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i=0; i < target.length; i++){
            if(target[i] != arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        ArrayCanBeEqual s = new ArrayCanBeEqual();

        int target[]= {1,2,3,4};
        int arr[]={2,4,1,3};

        boolean result = s.canBeEqual(target,arr);
        System.out.print(result);
    }
}