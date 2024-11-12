class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> myList = new ArrayList<String>();
        for(int i=1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                myList.add("FizzBuzz");
            }
            else if(i % 5 == 0){
                myList.add("Buzz");
            }
            else if(i % 3 == 0){
                myList.add("Fizz");
            }
            else{
                myList.add(String.valueOf(i));
            }
        }
        return myList;
    }
}