class NumberOfProvinces{
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] v = new boolean[n];
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(!v[i]){
                count++;
                dfs(isConnected, v, i);
            }
        }
        return count;
    }
    public void dfs(int[][]isConnected, boolean[] v, int node){
        v[node] = true;
        for(int i=0; i<isConnected.length; i++){
            if(isConnected[node][i] == 1 && !v[i]){
                dfs(isConnected, v, i);
            }
        }
    }
}