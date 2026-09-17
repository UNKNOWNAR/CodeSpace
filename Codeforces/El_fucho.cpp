//
// Created by amiar on 25-10-2025.
//
#include<bits/stdc++.h>
using namespace std;
int count(int W,int L,vector<vector<int>> &memo) {
    if ()
    if (W==1&&L==1) return 1;
    if (W<2&&L<2) return 0;
    if (memo[W][L]!=-1) return memo[W][L];
    int new_W=W,new_L=L;
    if (W%2==0&&L%2==0) {
        new_L=L/2+W/2;
        new_W=W/2;
    }
    else if (W%2==0&&L%2!=0) {
        new_L = L/2+W/2+1;
        new_W=W/2;
    }
    else if (W%2!=0&&L%2==0) {
        new_L=L/2+W-W/2-1;
        new_W=W/2+1;
    }
    else {
        new_L = L/2+W-W/2;
        new_W=W/2+1;
    }
    memo[W][L] = count(new_W,new_L,memo)+W/2+L/2;
    return memo[W][L];
}
int main() {
    int n;
    cin >>n;
    vector<vector<int>> memo(n+1,vector<int>(n+1,-1));
    while (n!=0) {
        int temp = 0;
        cin >>temp;
        cout <<count(temp,0,memo)<<endl;
        n--;
    }
    return 0;
}