class AddBinary {
    public String addBinary(String a, String b) {
        int m = a.length()-1;
        int n = b.length()-1;

        int carry = 0;
        String result = "";
        while(m >= 0 || n >= 0 || carry != 0){
            int sum = carry;
            if(m>=0){
                sum+=a.charAt(m) - '0';
                m--;
            }
            if(n>=0){
                sum+=b.charAt(n) - '0';
                n--;
            }
            carry = sum/2;
            result = (sum % 2) + result;
        }
        return result;
    }
}