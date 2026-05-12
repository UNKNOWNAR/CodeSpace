#include<bits/stdc++.h>
using namespace std;
class Shape{
    public:
    virtual void draw(){
        cout<<"Drawing a shape"<<endl;
    }
};
class Circle:public Shape{
    public:
    void draw(){
        cout<<"Drawing a circle"<<endl;
    }
};
int main(){
    Shape *s;
    Circle c;
    s=&c;
    s->draw();
    cout<<typeid(s).name()<<endl;
    cout<<typeid(c).name()<<endl;
    return 0;
}