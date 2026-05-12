#include<bits/stdc++.h>
using namespace std;

void BinarySearch(int arr[], int l, int h, int x){
    if(l>h) return;
    int mid = l + (h-l)/2;
    if(arr[mid]==x) cout<<"Element found at position "<<mid<<endl;
    else if(arr[mid]<x) BinarySearch(arr, mid+1, h, x);
    else BinarySearch(arr, l, mid-1, x);
}

int main(){
    int arr[] = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
    int n = sizeof(arr)/sizeof(arr[0]);
    int x = 18;
    BinarySearch(arr, 0, n-1, x);
    return 0;
}