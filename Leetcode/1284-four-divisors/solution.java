class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> memo = new HashMap<>();
        for(int num:nums){
            if(memo.containsKey(num)){
                ans += memo.get(num);
                continue;
            }
            int count = 0;
            int sum = 0;
            for(int i=1;i*i<=num;i++){
                if(num%i==0){
                    count++;
                    sum += i;
                    if(i != num / i) { // Count the pair 'num/i'
                        count++;
                        sum += num / i;
                    }
                }
                if (count > 4) break;
            }
            if(count==4){
                ans += sum;
                if(!memo.containsKey(num))
                    memo.put(num,sum);
            }
            else
                memo.put(num,0);
        }
        return ans;
    }
}
