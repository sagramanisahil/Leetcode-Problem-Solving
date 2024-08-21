class NumberComplement{
    public int findComplement(int num) {
        int bit = 0;
        int temp = num;

        while(temp > 0){
            bit = (bit << 1) | 1;
            temp >>= 1;
        }
        return num ^ bit;
    }
}