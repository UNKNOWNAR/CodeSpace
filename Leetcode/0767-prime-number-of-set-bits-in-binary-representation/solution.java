class Solution {
    Set<Integer> Prime;
    private boolean check(int num){
        if(num==1)
            return false;
        if(Prime.contains(num))
            return true;
        for(int i=2;i<num;i++){
            System.out.println(i);
            if((num%i)==0)
                return false;
        }
        Prime.add(num);
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        Prime = new HashSet<>();
        int count = 0;
        for(int num=left;num<=right;num++){
            int setBits = 0;
            int temp = num;
            while(temp!=0){
                if((temp&1)==1)
                    setBits++;
                temp = temp>>1;
            }
            if(check(setBits))
                count++;
        }
        return count;
    }
}
