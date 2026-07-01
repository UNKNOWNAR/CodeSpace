class Solution {
    public int countTriples(int n) {
        int ans=0;
        for(int i=3;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int req=(int)Math.sqrt(i*i+j*j);
                if((req*req)==(i*i+j*j) && req<=n) ans+=2;
            }
        } 
        return ans;
    }
}
