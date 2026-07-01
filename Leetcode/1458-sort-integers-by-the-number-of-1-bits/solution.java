class Solution {
    private class BitCount{
        int count = 0;
        int number = 0;
        BitCount(int number,int count){
            this.number = number;
            this.count = count;
        }
    }
    private int countBits(int number){
        int count = 0;
        while(number!=0){
            if((number&1)==1)
                count++;
            number = number>>1;
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
        int ans[] = new int[arr.length];
        BitCount temp[] = new BitCount[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i] = new BitCount(arr[i],countBits(arr[i]));
        }
        Arrays.sort(temp,(a,b)->{
            if(a.count!=b.count)
                return a.count-b.count;
            return a.number-b.number;
        });
        for(int i=0;i<arr.length;i++){
            ans[i] = temp[i].number;
        }
        return ans;
    }
}
