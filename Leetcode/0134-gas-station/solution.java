class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;

        for(int g : gas){
            totalGas += g;
        }

        for(int c : cost){
            totalCost += c;
        }

        if(totalGas < totalCost){
            return -1;
        }

        int currentGas = 0;
        int startInd = 0;

        for(int i=0; i<gas.length ; i++){
            currentGas += (gas[i] - cost[i]);

            if(currentGas < 0){
                startInd = i + 1;
                currentGas = 0;
            }
        }

        return startInd;
    }
}
