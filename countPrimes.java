class countPrimes {
    public int countPrimes(int n) {
        if(n < 2){
            return 0;
        }
        boolean[] primeNumber = new boolean[n];
        
        for(int i=2; i<n; i++){
            primeNumber[i] = true;
        }
        for(int i=2; i*i<n; i++){
            if(primeNumber[i]){
                for(int j=i*i; j<n; j+=i){
                    primeNumber[j] = false;
                }
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(primeNumber[i]){
                count++;
            }
        }
        return count;
    }
}