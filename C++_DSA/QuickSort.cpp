#include <bits/stdc++.h>
using namespace std;

int partition(vector<int> &arr, int low, int high){
    int pivot = arr[high];
    int i = low-1;
    for(int j=low;j<high;j++){
        if(arr[j]<=pivot){
            i++;
            swap(arr[i],arr[j]);
        }
    }
    i++;
    swap(arr[i],arr[high]);
    return i;
}

void quickSort(vector<int> &arr, int low, int high){
    if(low<high){
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    }
}

int main(){
    vector<int> nums = {10, 7, 8, 9, 1, 5};
    partition(nums, 0, nums.size()-1);
    for(int i=0;i<nums.size();i++){
        cout<<nums[i]<<" ";
    }
}