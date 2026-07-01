class Solution {
    public int bestClosingTime(String customers) {
        int curPenalty = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                curPenalty++;
            }
        }

        int minPenalty = curPenalty;
        int bestHour = 0;

        for(int i=0;i<customers.length();i++){
            char ch = customers.charAt(i);

            if(ch=='Y')
                curPenalty--;
            else 
                curPenalty++;

            if(curPenalty<minPenalty){
                minPenalty = curPenalty;
                bestHour = i+1;
            }
        }
        
        return bestHour;
    }
}
