class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        int nums[] = new int[nums2.length];
        int top = nums.length;
        for(int i=nums2.length-1;i>-1;i--){
            while(top!=nums2.length&&nums2[top]<=nums2[i])
                top++;
            if(top==nums2.length){
                nums2[--top]=nums2[i];
                map.put(nums2[i],-1);
            }
            else if(nums2[top]>nums2[i]){
                map.put(nums2[i],nums2[top]);
                nums2[--top] = nums2[i];
            }
        }
        for(int i=0;i<nums1.length;i++)
            nums1[i] = map.get(nums1[i]);
        return nums1;
    }
}
