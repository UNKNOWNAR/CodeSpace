#include <bits/stdc++.h>
using namespace std;
void countingSort(vector<int> &arr, int place){
    int n = arr.size();
    vector<int> output(n);
    vector<int> count(10,0);
    for(int i=0;i<n;i++){
        count[(arr[i]/place)%10]++;
    }
    for(int i=1;i<10;i++){
        count[i]+=count[i-1];
    }
    for(int i=n-1;i>=0;i--){
        output[count[(arr[i]/place)%10]-1] = arr[i];
        count[(arr[i]/place)%10]--;
    }
    for(int i=0;i<n;i++){
        arr[i] = output[i];
    }
}

int getMax(vector<int> &arr){
    int max = arr[0];
    for(int i=1;i<arr.size();i++){
        if(arr[i]>max)
            max = arr[i];
    }
    return max;
}

void radixSort(vector<int> &arr){
    int max = getMax(arr);
    for(int place=1;max/place>0;place*=10){
        countingSort(arr,place);
    }
}

int main(){
    vector<int> nums = {10, 7, 8, 9, 1, 5};
    radixSort(nums);
    for(int i=0;i<nums.size();i++){
        cout<<nums[i]<<" ";
    }
}