#include <iostream>
#include <vector>

#define ll long long
using namespace std;

vector<ll> collatz(ll n) {
    vector<ll> vec;
    ll val = n;

    while (true) {
        vec.push_back(val);
        if (val == 1) {
            break;
        }

        if (val % 2 == 0) {
            val = val/2;
        } else {
            val = val * 3 + 1;
        }
    }

    return vec;
}

int search(vector<ll> vec, ll aVal) {
    // vec is the b vector
    for (int i = 0; i < vec.size(); i++) {
        if (aVal == vec[i]) {
            return i;
        }
    }

    return -1;
}

int main() {
    while(true) {
        int a, b;
        cin >> a;
        cin >> b;

        if (a == 0 and b == 0) {
            break;
        }

        vector<ll> first = collatz(a);
        vector<ll> second = collatz(b);

        int steps1 = 0;
        int steps2 = 0;

        for (int i = 0; i < first.size(); i++) {
            steps2 = search(second, first.at(i));

            if (steps2 != -1) {
                steps1 = i;
                break;
            }
        }

        cout << a << " needs " << steps1 << " steps, " << b << " needs " << steps2 << " steps, they meet at " << first.at(steps1) << endl;
    }

    return 0;
}
