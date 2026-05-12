/*
Assume two classes ABC and XYZ have a private data member each of their own. Initialize their
values with suitable constructors. Show (with proper code snippet) how the values of those two member
variables can be swapped with the help of only one function.
*/

#include<bits/stdc++.h>
using namespace std;
class XYZ; // Forward declaration

class ABC{
    private:
    int a;
    public:
    ABC(int a){
        this->a=a;
    }
    void print(){
        cout<<"a = "<<a<<endl;
    }
    friend void swap(ABC &obj, XYZ &obj1);
};

class XYZ{
    private:
    int b;
    public:
    XYZ(int b){
        this->b=b;
    }
    void print(){
        cout<<"b = "<<b<<endl;
    }
    friend void swap(ABC &obj, XYZ &obj1);
};

void swap(ABC &obj, XYZ &obj1){
    int temp = obj.a;
    obj.a = obj1.b;
    obj1.b = temp;
}

int main(){
    ABC a(1);
    XYZ b(2);
    a.print();
    b.print();
    swap(a,b);
    a.print();
    b.print();
    return 0;
}