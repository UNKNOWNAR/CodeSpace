#include<bits/stdc++.h>
using namespace std;

void InterpolationSearch(int arr[], int l, int h, int x){
    if(l>h || x<arr[l] || x>arr[h]) return;
    int pos = l + ((h-l)/(arr[h]-arr[l]))*(x-arr[l]);
    if(arr[pos]==x) cout<<"Element found at position "<<pos<<endl;
    else if(arr[pos]<x) InterpolationSearch(arr, pos+1, h, x);
    else InterpolationSearch(arr, l, pos-1, x);
}

int main(){
    int arr[] = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
    int n = sizeof(arr)/sizeof(arr[0]);
    int x = 18;
    InterpolationSearch(arr, 0, n-1, x);
    return 0;
}