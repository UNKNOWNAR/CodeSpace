#include <iostream>
using namespace std;

class A {
public:
    int x;
};

// Use the virtual keyword here
class B : virtual public A { };
class C : virtual public A { };

class D : public B, public C { };

int main() {
    D obj;
    obj.x = 10; // Works perfectly! Only one 'x' exists.
    cout << "Value of x: " << obj.x << endl;
    return 0;
}