class Solution {
private:
    void heapify(vector<int>& nums,int n,int i){
        int largest = i;
        int leftChild = 2*i+1;
        int righttChild = 2*i+2;
        if(leftChild<n&&nums[leftChild]>nums[largest])
            largest = leftChild;
        if(righttChild<n&&nums[righttChild]>nums[largest])
            largest = righttChild;
        if(largest != i){
            swap(nums[i],nums[largest]);
            heapify(nums,n,largest);
        }
    }
public:
    vector<int> sortArray(vector<int>& nums) {
        int n = nums.size();

        // 1. Build Max-Heap (rearrange array)
        // Start from the last non-leaf node and move upwards
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(nums, n, i);

        // 2. Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to the end (sorted position)
            swap(nums[0], nums[i]);
            // Call max heapify on the reduced heap
            heapify(nums, i, 0);
        }
        return nums;
    }
};
