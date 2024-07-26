class AddDigits{
    public int addDigits(int num) {
        int count=0;
        if(num > 0){
            count = (num-1)%9+1;
        }
        else{
            return num;
        }
        return count;
    }
    public static void main(String args[]){
        AddDigits s = new AddDigits();

        int result = s.addDigits(38);
        System.out.println("The result is : " + result);
    }
}