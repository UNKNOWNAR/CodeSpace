class Solution {
private: class DSU{
    vector<int> parent;
    vector<int> size;
public:
    DSU(int n){
        parent.resize(n);
        iota(parent.begin(),parent.end(),0);
        size.assign(n,1);
    }
    int find(int x){
        if(parent[x]==x)
            return x;
        return parent[x]=find(parent[x]);
    }
    void merge(int x,int y){
        int parentX = find(x);
        int parentY = find(y);
        if(parentX==parentY)
            return;
        if(size[parentX]>size[parentY]){
            parent[parentY] = parentX;
            size[parentX] += size[parentY];
        }
        else{
            parent[parentX] = parentY;
            size[parentY] += size[parentX];
        }
    }
};
public:
    vector<vector<string>> accountsMerge(vector<vector<string>>& accounts) {
        int accountListSize = accounts.size();
        DSU dsu(accountListSize);
        unordered_map<string, int> emailGroup;
        for(int i=0;i<accountListSize;i++){
            int accountSize = accounts[i].size();
            string name = accounts[i][0];
            for(int j=1;j<accountSize;j++){
                string email = accounts[i][j];
                if (emailGroup.find(email) == emailGroup.end()) //first time seiing thie email
                    emailGroup[email] = i;
                else//merge both the accounts
                    dsu.merge(i,emailGroup[email]);
            }
        }
        unordered_map<int, vector<string>> components;
        for(auto emailIterator:emailGroup){
            string email = emailIterator.first;
            int group = emailIterator.second;
            components[dsu.find(group)].push_back(email);
        }
        vector<vector<string>> mergedAccounts;
        for(auto componentIterator:components){
            int group = componentIterator.first;
            vector<string> component;
            component.push_back(accounts[group][0]);
            component.insert(component.end(),componentIterator.second.begin(),componentIterator.second.end());
            sort(component.begin()+1,component.end());
            mergedAccounts.push_back(component);
        }
        return mergedAccounts;
    }
};
