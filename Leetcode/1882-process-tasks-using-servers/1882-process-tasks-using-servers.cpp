class Solution {
public:
    using pi = pair<int,int>;//wt,indx
    using tl = tuple<long long,int,int>;//findTime,wt,indx
    vector<int> assignTasks(vector<int>& servers, vector<int>& tasks) {
        int n = servers.size();
        int m = tasks.size();
        priority_queue<pi,vector<pi>,greater<pi>> freeServers;
        priority_queue<tl,vector<tl>,greater<tl>> busyServers;
        for(int i=0;i<n;i++)
            freeServers.push({servers[i],i});
        vector<int> results(m);
        for(int i=0;i<m;i++){
            while(!busyServers.empty() && get<0>(busyServers.top()) <= i){
                auto [finishTime, wt, indx] = busyServers.top();
                busyServers.pop();
                freeServers.push({wt,indx});
            }
            if(freeServers.empty()){
                auto [finishTime, wt, indx] = busyServers.top();
                busyServers.pop();
                results[i] = indx;
                busyServers.push({finishTime+tasks[i],wt,indx});
            }
            else{
                auto [wt,indx] = freeServers.top();
                freeServers.pop();
                results[i] = indx;
                busyServers.push({i+tasks[i],wt,indx});
            }
        }
        return results;
    }
};