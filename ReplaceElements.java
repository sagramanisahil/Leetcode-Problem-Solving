public class ReplaceElements{
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return arr;
        }

        int maxFromRight = -1;

        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];

            arr[i] = maxFromRight;
            
            if (current > maxFromRight) {
                maxFromRight = current;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = replaceElements(arr);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
