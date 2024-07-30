class MinimumDeletions{
    public int minimumDeletions(String s) {
        int ans = 0, countB = 0;
        for(char c : s.toCharArray()) {
            if(c == 'a') {
                ans = Math.min(ans + 1, countB);
            } else {
                countB++;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        MinimumDeletions sol = new MinimumDeletions();
        
        String s = "aababbab";
        int result = sol.minimumDeletions(s);
        System.out.print(result);
    }
}