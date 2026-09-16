class ExamTracker {
public:
    using ll = long long;
    vector<ll> prefixSum;
    vector<int> times;
    ExamTracker() {
    }
    
    void record(int time, int score) {
        if(prefixSum.size()==0)
            prefixSum.push_back(score);
        else
            prefixSum.push_back(score+prefixSum[prefixSum.size()-1]);
        times.push_back(time);
    }
    
    ll totalScore(int startTime, int endTime) {
        int low = lower_bound(times.begin(),times.end(),startTime)-times.begin();
        int high = upper_bound(times.begin(),times.end(),endTime)-times.begin()-1;
        if(low>high)
            return 0;
        return prefixSum[high]-(low==0?0:prefixSum[low-1]);
    }
};

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker* obj = new ExamTracker();
 * obj->record(time,score);
 * long long param_2 = obj->totalScore(startTime,endTime);
 */