class DistanceTwoCities {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
       int[][] distance = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
            distance[i][i] = 0;
        }
        
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            distance[from][to] = weight;
            distance[to][from] = weight;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (distance[i][k] != Integer.MAX_VALUE && distance[k][j] != Integer.MAX_VALUE) {
                        distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                    }
                }
            }
        }
        int minReachableCities = Integer.MAX_VALUE;
        int resultCity = -1;

        for (int i = 0; i < n; i++) {
            int reachableCities = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && distance[i][j] <= distanceThreshold) {
                    reachableCities++;
                }
            }
            if (reachableCities <= minReachableCities) {
                if (reachableCities == minReachableCities) {
                    resultCity = Math.max(resultCity, i);
                } else {
                    resultCity = i;
                }
                minReachableCities = reachableCities;
            }
        }

        return resultCity;
    }

    public static void main(String[] args) {
        DistanceTwoCities sol = new DistanceTwoCities();
        int n = 4;
        int[][] edges = { {0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1} };
        int distanceThreshold = 4;
        int result = sol.findTheCity(n, edges, distanceThreshold);
        System.out.println("The city with the smallest number of reachable cities is: " + result);
    }
}