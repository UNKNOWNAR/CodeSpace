class Solution {
    Integer dp[][];
    public int maxDotProduct(int[] nums1, int[] nums2) {
        dp = new Integer[nums1.length][nums2.length];
        return calcProduct(0,0,nums1,nums2);
    }
    private int calcProduct(int indx1,int indx2,int[] nums1, int[] nums2){
        if (indx1 == nums1.length || indx2 == nums2.length) return -1000000000;
        if(dp[indx1][indx2]!=null)
            return dp[indx1][indx2];
        int product = -1000000000;
        
        int product1 = nums1[indx1]*nums2[indx2]+Math.max(0,calcProduct(indx1+1,indx2+1,nums1,nums2));
        product = Math.max(product,product1);
        product1 = calcProduct(indx1+1,indx2,nums1,nums2);
        product = Math.max(product,product1);
        product1 = calcProduct(indx1,indx2+1,nums1,nums2);
        product = Math.max(product,product1);

        return dp[indx1][indx2] = product;
    }
}
