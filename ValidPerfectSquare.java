class ValidPerfectSquare{
    public boolean isPerfectSquare(int num) {
        double pSquare = Math.sqrt(num);
        if(pSquare == (int)pSquare){
            return true;
        }
        return false;
    }
}