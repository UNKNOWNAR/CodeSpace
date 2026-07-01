class Solution {
    private int calcBinary(String binary){
        int num = 0;
        for(char c:binary.toCharArray()){
            num=num<<1;
            if(c=='1')
                num++;
        }
        return num;
    }
    private String converttoBinary(int num,int n){
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            if(num%2==0)
                sb.append('0');
            else
                sb.append('1');
            num=num>>1;
        }
        for(int i = sb.length();i<n;i++){
            sb.append('0');
        }
        return sb.reverse().toString();
    }
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<Integer> unique = new HashSet<>();
        for(String num:nums){
            unique.add(calcBinary(num));
        }
        for(int i=0;i<(1<<n);i++){
            if(!unique.contains(i))
                return converttoBinary(i,n);
        }
        return "0";
    }
}
