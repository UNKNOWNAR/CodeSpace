class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> answer = new ArrayList<>();
        int reamainder = 0;
        for(int i=0;i<nums.length;i++){
            reamainder = (reamainder*2 + nums[i])%5;
            answer.add(reamainder==0);
        }
        return answer;
    }
}
