class Solution {
    public int minFlips(String s) {
        int n = s.length();
        s += s;
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(i%2==0){
                if(c=='1')
                    odd++;
                else
                    even++;
            }
            else{
                if(c=='1')
                    even++;
                else
                    odd++;
            }
        }
        int ans = Math.min(odd,even);
        for(int i=n;i<2*n;i++){
            char c = s.charAt(i);
            if(i%2==0){
                if(c=='1')
                    odd++;
                else
                    even++;

            }
            else{
                if(c=='1')
                    even++;
                else
                    odd++;
            }
            c = s.charAt(i-n);
            if((i-n)%2==0){
                if(c=='1')
                    odd--;
                else
                    even--;
            }
            else{
                if(c=='1')
                    even--;
                else
                    odd--;
            }
            ans = Math.min(ans,Math.min(odd,even));
        }
        return ans;
    }
}
