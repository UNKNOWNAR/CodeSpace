#include <bits/stdc++.h>
using namespace std;

class Stack{
    int *arr;
    int top;
    int size;
    public:
    Stack(int size){
        this->size = size;
        arr = new int[size];
        top = -1;
    }
    void push(int val){
        if(top==size-1){
            cout<<"Stack Overflow"<<endl;
            return;
        }
        arr[++top] = val;
    }
    int pop(){
        if(top==-1){
            cout<<"Stack Underflow"<<endl;
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if(top==-1){
            cout<<"Stack is empty"<<endl;
            return -1;
        }
        return arr[top];
    }
    bool isEmpty(){
        return top==-1;
    }
    bool isFull(){
        return top==size-1;
    }
}

int main(){
    Stack st(5);
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    cout<<st.pop()<<endl;
    cout<<st.peek()<<endl;
    cout<<st.isEmpty()<<endl;
    cout<<st.isFull()<<endl;
}