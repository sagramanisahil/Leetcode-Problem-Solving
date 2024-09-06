class CanPlaceFlower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0;
        for(int i=0; i < flowerbed.length; i++){
            if(flowerbed[i]==0){
                int back = (i==0 || flowerbed[i-1]==0 ? 0 : 1);
                int next = (i == flowerbed.length-1 || flowerbed[i+1]==0 ? 0 : 1);
                if(back == 0 && next == 0){
                flowerbed[i] = 1;
                c++;
                }
            }
        }
        return c >= n;
    }
}