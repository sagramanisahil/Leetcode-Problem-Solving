class UglyNumberII {
    public int nthUglyNumber(int n) {
       int[] ugly = new int[n];
       ugly[0] = 1;

       int p2 = 0, p3 = 0, p5 = 0;
       int next2 = 2, next3 = 3, next5 = 5;

       for(int i=1; i<n; i++){
            int next = Math.min(next2, Math.min(next3,next5));
            ugly[i] = next;

            if(next == next2){
                p2++;
                next2 = ugly[p2] * 2;
            }
            if(next == next3){
                p3++;
                next3 = ugly[p3] * 3;
            }
            if(next == next5){
                p5++;
                next5 = ugly[p5] * 5;
            }
       }
       return ugly[n-1];
    }
}