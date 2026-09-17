#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve(vector<ll>& primes) {//no of divisors for n = p^a*q^b... is (a+1)(b+1)... so acordinf to the question (a+1)(b+1).. = 4 a = 3 comparing or (a+1)(b+1). = 2*2 a = 1 b = 1 where a and b are primes  
    ll d;
    cin>>d;
    ll p = -1;//look for prime in the distance with diff d
    int p_index = 0;
    for (ll i = 0; i < primes.size(); i++) // O(9000)
    {
        if (primes[i] >= (1 + d))
        {
            p_index = i;
            p = primes[i];
            break;
        }
    }
    ll q = -1;//look for prime in the distance with diff d
    for (ll i = p_index; i < primes.size(); i++) // O(9000)
    {
        if(primes[i]>= (p + d))
        {
            q = primes[i];
            break;
        }
    }
    cout << min(1LL*p*p*p, 1LL*p*q) << endl;
}

int main() {
    fast_io; 
    int t;
    cin >> t; 
    vector<ll> primes;
    for (ll i = 2; i <= 100000; i++) // O(10^5)
    {
        bool is_prime = true;
        for (ll j = 2; j * j <= i; j++) // O(sqrt(10^5)) = O(10^2)
        {
            if (i % j == 0)
            {
                is_prime = false;
                break;
            }
        }
        if (is_prime)
            primes.push_back(i);
    }
    while (t--) {
        solve(primes);
    }
    return 0;
}