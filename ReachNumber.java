class ReachNumber {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int numMoves = 0;
        int s = 0;

        while(s < target || (s-target) % 2 != 0){
            numMoves++;
            s += numMoves;
        }
        return numMoves;
    }
}