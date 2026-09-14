class Solution {
public:
    int calculate(string s) {
        vector<int> nums;
        int curr = 0;
        char op = '+';
        for (int i = 0; i <= s.size(); i++) {
            if (i < s.size() && isdigit(s[i])) 
                curr = curr * 10 + (s[i] - '0');
            if (i == s.size() || (s[i] != ' ' && !isdigit(s[i]))) {
                if (op == '+')
                    nums.push_back(curr);
                else if (op == '-')
                    nums.push_back(-curr);
                else if (op == '*') 
                    nums.back() *= curr;
                else if (op == '/') 
                    nums.back() /= curr;
                op = s[i];
                curr = 0;
            }
        }
        int ans = 0;
        for (int x : nums)
            ans += x;
        return ans;
    }
};