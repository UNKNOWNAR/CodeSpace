#include<bits/stdc++.h>
using namespace std;
int main() {
    int n;
    cin >>n;
    while (n!=0) {
        int a,b,c;
        cin >>a>>b>>c;
        if(a==b){
            if(c%2==0) cout << "Second"<<endl;
            else cout <<"First"<<endl;
        }
        else if (a>b){
            cout << "First"<<endl;
        }
        else {
            cout << "Second"<<endl;
        }
        n--;
    }
    return 0;
}