class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean found = false;
        boolean found1 = false;
        boolean found2 = false;
       for(int triplet[]:triplets){
            if(triplet[0]>target[0])continue;
            if(triplet[1]>target[1])continue;
            if(triplet[2]>target[2])continue;
            if(triplet[0]==target[0]) found = true;
            if(triplet[1]==target[1]) found1 = true;
            if(triplet[2]==target[2]) found2 = true;
            if(found&&found1&&found2)
                break;
        }
        return found&&found1&&found2;
    }
}
