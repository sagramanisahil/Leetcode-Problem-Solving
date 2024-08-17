class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int n = s.length();
        int ans = Integer.MAX_VALUE;

        for(int i='a'; i<='z'; i++){
            int index = s.indexOf(i);

            if(index!=-1 && index == s.lastIndexOf(i)){
                ans = Math.min(ans,index);
            }
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        else{
            return ans;
        }
    }
}