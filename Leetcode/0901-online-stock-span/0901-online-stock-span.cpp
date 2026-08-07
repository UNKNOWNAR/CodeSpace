class StockSpanner {
public:
    vector<int> elements;
    stack<int> nXtGreater;
    int indx;
    StockSpanner() {
        indx = -1;
    }
    int next(int price) {
        elements.push_back(price);
        while(!nXtGreater.empty()&&elements[nXtGreater.top()]<=price)
            nXtGreater.pop();
        int nG = nXtGreater.empty()?-1:nXtGreater.top();
        nXtGreater.push(++indx);
        return indx-nG;
    }
};

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */