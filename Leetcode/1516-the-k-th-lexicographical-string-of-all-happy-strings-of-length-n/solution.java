class Solution {
    public String getHappyString(int n, int k) {
        return helper(' ',n,k);
    }
    private String helper(char prev,int n,int k){
        if(n==0)
            return "";
        if(prev!='a'){
            if((1<<(n-1))>=k)
                return "a"+helper('a',n-1,k);
            k-=1<<(n-1);
        }
        if(prev!='b'){
            if((1<<(n-1))>=k)
                return "b"+helper('b',n-1,k);
            k-=1<<(n-1);
        }
        if((1<<(n-1))>=k)
            return "c"+helper('c',n-1,k);
        return "";
    }
}
