#include<bits/stdc++.h>
using namespace std;

class Calculator{
    public:
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    double sum(double a, double b){
        return a+b;
    }
};

int main(){
    Calculator calc;
    cout<<calc.sum(1,2)<<endl;
    cout<<calc.sum(1,2,3)<<endl;
    cout<<calc.sum(1.1,2.2)<<endl;
    return 0;
}