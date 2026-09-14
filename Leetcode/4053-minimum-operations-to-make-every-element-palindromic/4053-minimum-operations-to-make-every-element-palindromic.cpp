class Solution {
    using ll = long long;
public:
    inline static vector<ll> P[2];
    inline static bool ready = false;
    static void generate(){
        if(ready)   return;
        ll M = 1e9;
        for(int num=1;num<1e5;num++){
            string s = to_string(num);
            string r = s;
            reverse(r.begin(),r.end());
            ll evenP = stoll(s+r);//even Length Palindrome
            s.pop_back();
            ll oddP = stoll(s+r);//odd length Palindrome
            if(evenP<=M)
                P[evenP&1].push_back(evenP);//store in even plaindrome list
            if(oddP<=M)
                P[oddP&1].push_back(oddP);//store in odd palindrome list
        }
        sort(P[0].begin(),P[0].end());
        sort(P[1].begin(),P[1].end());
        ready = true;
    }
    ll minOperations(vector<int>& nums) {
        generate();
        ll count = 0;
        for(int num:nums){
            auto &p = P[num&1];
            int indx = lower_bound(p.begin(),p.end(),num)-p.begin();
            if(indx>=p.size())
                indx = p.size()-1;
            ll d1 = abs(p[indx]-num);
            ll d2 = indx==0?d1:abs(num-p[indx-1]);
            count += min(d1,d2)/2;
        }
        return count;
    }
};