class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int answer[] = new int[n];
        int indx = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot)
                answer[indx++] = nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot)
                answer[indx++] = nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot)
                answer[indx++] = nums[i];
        }
        return answer;
    }
}
