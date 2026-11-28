class Solution {
public:
    using ll = long long;
    int maximumSaleItems(vector<vector<int>>& items, ll budget) {
        int max_val = 0,min_price = 1e9;
        map<ll,int> divideCount;
        map<ll,int> freq;
        for(auto item:items){
            min_price = min(min_price,item[1]);
            max_val = max(item[0],max_val);
            freq[item[0]]++;
        }
        for(int i=1;i<=max_val;i++){
            divideCount[i] = -1;
            for(int j=i;j<=max_val;j+=i){
                if(freq.contains(j))
                    divideCount[i]+=freq[j];
            }
        }
        priority_queue<pair<double,int>,vector<pair<double,int>>,greater<pair<double,int>>> minHeap;
        for(int i=0;i<items.size();i++){
            if(divideCount[items[i][0]]>=1)
                minHeap.push({items[i][1]/2.0,i});
        }
        ll count = 0;
        while(budget>0&&!minHeap.empty()&&minHeap.top().first<=min_price){
            auto [val,i] = minHeap.top();
            minHeap.pop();
            if(budget>=1LL*items[i][1]*divideCount[items[i][0]]){
                count += 1LL*divideCount[items[i][0]]*2;
                budget -= 1LL*items[i][1]*divideCount[items[i][0]];
            }
            else{
                count += (budget/items[i][1])*2;
                budget %= items[i][1];
            }
        }
        return count+(budget/min_price);
    }
};