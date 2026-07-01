class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        // 1. Drink all initial full bottles.
        int totalBottlesDrunk = numBottles;
        int emptyBottles = numBottles;
        
        // Loop as long as we have enough empty bottles for the current exchange rate
        while (emptyBottles >= numExchange) {
            
            // 1. Perform the exchange: Lose numExchange empty bottles
            emptyBottles -= numExchange;
            
            // 2. Gain 1 full bottle and immediately drink it:
            totalBottlesDrunk += 1; // Increase total drunk count
            emptyBottles += 1;      // The newly drunk bottle immediately becomes a new empty bottle
            
            // 3. Increase the exchange rate for the next exchange
            numExchange++;
        }
        
        return totalBottlesDrunk;
    }
}
