/*
   Heap Sort algorithm 
   Time Complexity: O(n log n)
   Space Complexity: O(1)
   for root i
   parent i/2
   left child 2*i
   right child 2*i+1
*/ 
#include <bits/stdc++.h>
using namespace std;
vector<int> heap;
void heapify(vector<int> &heap,int i,int n){
    int largest = i;
    int left = 2*i;
    int right = 2*i+1;
    if(left<n && heap[left]>heap[largest]){
        largest = left;
    }
    if(right<n && heap[right]>heap[largest]){
        largest = right;
    }
    if(largest!=i){
        swap(heap[i],heap[largest]);
        heapify(heap,largest,n);
    }
}
void heapSort(vector<int> &heap){
    int n = heap.size();
    for(int i=n/2-1;i>=0;i--)
        heapify(heap,i,n);
    for(int i=n-1;i>0;i--){
        swap(heap[0],heap[i]);
        heapify(heap,0,i);
    }
}
void extractMax(vector<int> &heap){
    heap[0] = heap[heap.size()-1];
    heap.pop_back();
    heapify(heap,0,heap.size());
}
void insert(vector<int> &heap,int x){
    heap.push_back(x);//insert at last
    int i = heap.size()-1;//root of last elememt
    while(i>0 && heap[i]>heap[(i-1)/2]){//swap if child is greater than parent
        swap(heap[i],heap[(i-1)/2]);
        i = (i-1)/2;
    }
}
int main() {
    vector<int> heap = {10,20,30,40,50};
    heapSort(heap);
    for(int i=0;i<heap.size();i++){
        cout<<heap[i]<<" ";
    }
    insert(heap,60);
    cout<<endl;
    cout<<heap[0]<<endl;
    extractMax(heap);
    cout<<heap[0]<<endl;
}