#include <bits/stdc++.h>
using namespace std;

void bubbleSort(vector<int> &arr){
    int n = arr.size();
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
            }
        }
    }
}

int main(){
    vector<int> nums = {10, 7, 8, 9, 1, 5};
    bubbleSort(nums);
    for(int i=0;i<nums.size();i++){
        cout<<nums[i]<<" ";
    }
}