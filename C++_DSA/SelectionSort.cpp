#include <bits/stdc++.h>
using namespace std;
void selectionSort(vector<int> &arr){
    int n = arr.size();
    for(int i=0;i<n-1;i++){
        int mini = arr[i], minIndex = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<mini){
                mini = arr[j];
                minIndex = j;
            }
        }
        swap(arr[i],arr[minIndex]);
    }
}
int main(){
    vector<int> nums = {10, 7, 8, 9, 1, 5};
    selectionSort(nums);
    for(int i=0;i<nums.size();i++){
        cout<<nums[i]<<" ";
    }
}