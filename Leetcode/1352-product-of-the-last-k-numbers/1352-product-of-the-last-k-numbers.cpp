class ProductOfNumbers {
public:
    vector<int> prod;
    ProductOfNumbers() {
        prod = {1};
    }
    
    void add(int num) {
        if(!num)
            prod = {1};
        else
            prod.push_back(prod.back()*num);
    }
    
    int getProduct(int k) {
        if(k>=prod.size())
            return 0;
        else
            return prod.back()/prod[prod.size()-k-1];
    }
};

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers* obj = new ProductOfNumbers();
 * obj->add(num);
 * int param_2 = obj->getProduct(k);
 */