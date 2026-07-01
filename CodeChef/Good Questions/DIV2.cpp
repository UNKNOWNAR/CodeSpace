#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
string toBinary(int x) {
    string s;
    while (x) {
        s += char('0' + (x & 1));
        x >>= 1;
    }
    reverse(s.begin(), s.end());
    return s;
}
void solve() {
    int n;
    cin>>n;
    vector<string> arr(n);
    vector<int> num(n);
    int size = 33;
    for(int i=0;i<n;i++){
        int a;
        cin>>a;
        num[i] = a;
        arr[i] = toBinary(a);
        size = min(size, (int)arr[i].size());
    }
    string common = "";
    int indx = 0;
    for(int i=0;i<size;i++){
        char c = arr[0][i];
        bool flag = false;
        for(int j=1;j<n;j++){
            if(arr[j][i] == c) continue;
            else{
                flag = true;
                break;
            }
        }
        if(flag) break;
        common += c;
        indx++;
    }
    int num1 = 0;
    for(int i=0;i<indx;i++)
        num1 = num1*2 + (common[i]-'0');
    int count = 0;
    for(int i=0;i<n;i++){
        int temp = num[i];
        while(temp != num1){
            count++;
            temp = (temp>>1);
        }
    }    
    cout<<count<<endl; 
}

int main() {
    fast_io; 
    int t;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}