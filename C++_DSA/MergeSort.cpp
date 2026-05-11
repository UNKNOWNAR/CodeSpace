#include <bits/stdc++.h>
using namespace std;

void merge(vector<int> &arr, int low, int mid, int high){
    int n1 = mid - low + 1;
    int n2 = high - mid;
    vector<int> left(n1), right(n2);
    for(int i=0;i<n1;i++)
        left[i] = arr[low+i];
    for(int i=0;i<n2;i++)
        right[i] = arr[mid+1+i];
    int i=0,j=0,k=low;
    while(i<n1 && j<n2){
        if(left[i]<=right[j]){
            arr[k] = left[i];
            i++;
        }
        else{
            arr[k] = right[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        arr[k] = left[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k] = right[j];
        j++;
        k++;
    }
}

void mergeSort(vector<int> &arr, int low, int high){
    if(low<high){
        int mid = low + (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
}

int main(){
    vector<int> nums = {10, 7, 8, 9, 1, 5};
    mergeSort(nums, 0, nums.size()-1);
    for(int i=0;i<nums.size();i++){
        cout<<nums[i]<<" ";
    }
}