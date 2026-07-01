import java.util.*;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // A hand can't be partitioned if its size is not divisible by groupSize
        if (hand.length % groupSize != 0) {
            return false;
        }

        // Use a TreeMap to store card counts, which keeps cards sorted
        Map<Integer, Integer> cardCounts = new TreeMap<>();
        for (int card : hand) {
            cardCounts.put(card, cardCounts.getOrDefault(card, 0) + 1);
        }

        // Iterate through the sorted cards and try to form groups
        for (int card : cardCounts.keySet()) {
            int count = cardCounts.get(card);

            // If this card is already used up by previous groups, skip it
            if (count == 0) {
                continue;
            }

            // Try to form 'count' number of groups starting with the current card
            for (int i = 0; i < groupSize; i++) {
                int currentCard = card + i;

                // Check if we have enough consecutive cards to form the group
                if (cardCounts.getOrDefault(currentCard, 0) < count) {
                    return false;
                }
                
                // "Use" the cards by decrementing their counts
                cardCounts.put(currentCard, cardCounts.get(currentCard) - count);
            }
        }

        return true;
    }
}
