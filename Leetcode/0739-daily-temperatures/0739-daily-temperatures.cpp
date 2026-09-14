class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        int n = temperatures.size();
        stack<int> s;
        vector<int> answer(n,0);
        for(int i=n-1;i>=0;i--){
            while(!s.empty()){
                if(temperatures[i]<temperatures[s.top()]){
                    answer[i] = s.top()-i;
                    break;
                }
                s.pop();
            }
            s.push(i);
        }
        return answer;
    }
};