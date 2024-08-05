class NumberOfSeniorCitizen {
    public int countSeniors(String[] details) {
        int sC =0;
       for(String s : details){
          if(((s.charAt(11)-'0') * 10 + (s.charAt(12)-'0')) > 60){
            sC = sC+1;
          }
       }
       return sC; 
    }
    public static void main(String args[]){
       NumberOfSeniorCitizen s = new NumberOfSeniorCitizen();
        String details[] = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.print(s.countSeniors(details));
    }
}