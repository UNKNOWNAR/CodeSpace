class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int NumberBottlesDrank = numBottles;
        while(numBottles>=numExchange){
            NumberBottlesDrank += numBottles/numExchange;
            numBottles = numBottles/numExchange+numBottles%numExchange;
        }
        return NumberBottlesDrank;
    }
}
