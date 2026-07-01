class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int x = center[0];
        int y = center[1];
        int ansX = -1;
        int ansY = -1;
        int minQ = -1;
        for(int tower[]:towers){
            int dist = Math.abs(x-tower[0])+Math.abs(y-tower[1]);
            if(dist<=radius){
                if(tower[2]>minQ){
                    ansX = tower[0];
                    ansY = tower[1];
                    minQ = tower[2];
                }
                else if(tower[2]==minQ){
                    if(tower[0]<ansX){
                        ansX = tower[0];
                        ansY = tower[1];
                    }
                    else if(tower[0]==ansX&&tower[1]<ansY){
                         ansX = tower[0];
                        ansY = tower[1];
                    }
                }
            }
        }
        return new int[]{ansX,ansY};
    }
}
