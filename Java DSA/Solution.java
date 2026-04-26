import java.util.*;
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
            return false;
        HashSet<Integer> map = new HashSet<>();
        Arrays.sort(hand);
        int i=0,sum=0;
        while(hand.length-sum>=groupSize){
            while(map.size()!=groupSize){
                if(i<hand.length&&hand[i]!=-1&&!map.contains(hand[i])){
                    map.add(hand[i]);
                    hand[i]=-1;
                    sum+=1;
                }
                i++;
            }
            i = 0;
            map = new HashSet<>();
        }
        if(sum==hand.length)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        s.isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8},3);
    }
}