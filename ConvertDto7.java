class ConvertDto7{
    public String convertToBase7(int num) {
    //    return Integer.toString(num,7);
        int b = 1;
        int a = 0;
        while(num != 0){
            int remainder = num % 7;
            a += b * remainder;
            b *= 10;
            num/=7;
        }
        return Integer.toString(a);
    }
}