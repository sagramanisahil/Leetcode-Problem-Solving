import java.util.Arrays;

class UniqueOccurenceNumber{
    public boolean uniqueOccurrences(int[] arr) {
        int max = 1000;
        int min = -1000;
        int count[] = new int[max - min + 1];
       
        for(int i : arr){
            count[i - min]++;
        }
        
        Arrays.sort(count);

        for(int i = 0; i < count.length - 1; i++){
            if(count[i] != 0 && count[i] == count[i + 1]){
                return false;
            }
        }
        
        return true;
    }
}
