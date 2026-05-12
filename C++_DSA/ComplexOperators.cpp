#include<bits/stdc++.h>
using namespace std;
class Complex{
    private:
    int r;
    int i;
    public:
    Complex(int r, int i){
        this->r=r;
        this->i=i;
    }
    void print(){
        cout<<r<<"+"<<i<<"i"<<endl;
    }
    Complex operator + (Complex &obj){
        Complex temp(0,0);
        temp.r = r + obj.r;
        temp.i = i + obj.i;
        return temp;
    }
    Complex operator - (Complex &obj){
        Complex temp(0,0);
        temp.r = r - obj.r;
        temp.i = i - obj.i;
        return temp;
    }
};
int main(){
    Complex c1(1,2);
    Complex c2(3,4);
    Complex c3 = c1 + c2;
    c3.print();
    Complex c4 = c1 - c2;
    c4.print();
    return 0;
}