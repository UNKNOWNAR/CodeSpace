class Solution {
    int n;
    public int sortableIntegers(int[] nums) {
        n = nums.length;
        int expected[] = nums.clone();
        Arrays.sort(expected);
        int sumK = 0;
        for(int k=1;k<=n;k++){
            if(n%k==0&&canSort(nums,expected,k)){
                sumK += k;
            }
        }
        return sumK;
    }
    private boolean canSort(int nums[],int expected[],int k){
        for(int i=0;i<n;i+=k){
            if(!checkCycle(nums,expected,k,i))
                return false;
        }
        return true;
    }
    private boolean checkCycle(int nums[],int expected[],int k,int start){
        int buffer[] = new int[2*k];
        for(int i = 0;i<k;i++){
            buffer[i] = expected[start+i];
            buffer[i+k] = expected[start+i];
        }
        boolean match = false;
        for(int i=0;i<k;i++){
            int temp = i;
            int indx = 0;
            while(indx<k&&buffer[indx+i]==nums[start+indx])
                indx++;
            if(indx==k) return true;
            indx = 0;
        }
        return false;
    }
}
