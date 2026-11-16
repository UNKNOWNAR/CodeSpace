class Solution {
public:
    string digitSum(string s, int k) {
        while(s.size()>k){
            string update = "";
            int n = s.size();
            for(int i=0;i<n;i+=k){
                int sum = 0;
                for(int j=i;j<min(n,i+k);j++)
                    sum  += (int)(s[j]-'0');
                update += to_string(sum);
            }
            s = update;
        }
        return s;
    }
};