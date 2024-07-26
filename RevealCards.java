import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class RevealCards{
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        Deque<Integer> indexQueue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            indexQueue.offer(i);
        }
        int[] result = new int[n];
        for (int card : deck) {
            result[indexQueue.poll()] = card;
            if (!indexQueue.isEmpty()) {
                indexQueue.offer(indexQueue.poll());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RevealCards solution = new RevealCards();
        int[] deck1 = {17, 13, 11, 2, 3, 5, 7};
        int[] result1 = solution.deckRevealedIncreasing(deck1);
        System.out.println(Arrays.toString(result1)); 
        int[] deck2 = {1, 1000};
        int[] result2 = solution.deckRevealedIncreasing(deck2);
        System.out.println(Arrays.toString(result2));
    }
}
