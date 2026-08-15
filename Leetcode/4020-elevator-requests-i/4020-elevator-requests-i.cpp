class Solution {
public:
    int elevatorRequests(int n, vector<int>& requests) {
        int curr = 0,time = 0;
        for(int request:requests){
            time += abs(request-curr);
            curr = request;
        }
        return time;
    }
};