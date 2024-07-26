class AddStrings{
    public String addStrings(String num1, String num2) {
        String res = "";
        int i = num1.length()-1;
        int j = num2.length()-1;
        int c = 0;

        while(i >=0 || j>=0 || c!=0){
            int val1 = i>=0 ? num1.charAt(i) - '0':0;
            int val2 = j>=0 ? num2.charAt(j) - '0':0;

            i--;
            j--;

            int sum= val1 + val2 + c;
            res = (sum % 10) + res;
            c = sum/10;
        }
        return res;
    }
    public static void main(String args[]){
         AddStrings s = new  AddStrings();
        String n1 = "11";
        String n2= "123";

        String result = s.addStrings(n1,n2);
        System.out.print("The Sum is : "+result);
    }
}