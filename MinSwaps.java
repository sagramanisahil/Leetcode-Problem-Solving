class MinSwaps{
    public int minimumSwap(String s1, String s2) {
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(c1 == 'x' && c2 == 'y'){
                count1++;
            }
            else if(c1 == 'y' && c2 == 'x'){
                count2++;
            }
        }
        if((count1 + count2) % 2 != 0){
            return -1;
        }
        return (count1/2) + (count2/2) + (count1%2 * 2);
    }
}