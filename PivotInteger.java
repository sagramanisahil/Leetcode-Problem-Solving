class PivotInteger {
    public int pivotInteger(int n) {
        int sum = n * (n+1) / 2;

        int sum1 = (int) Math.sqrt(sum);

        if(sum1 * sum1 == sum){
            return sum1;
        }
        else{
            return -1;
        }
    }
}