#include <iostream>

using namespace std;

int main() {
    long long n, m;
    cin >> n;
    cin >> m;

    bool flag = true;
    bool myTurn = true;
    while(true) {
        if (n > m) {
            if (n % m == 0 || n > 2 * m) {
                if (!myTurn) {
                    flag = false;
                }
                break;
            }
            n -= m;
        } else {
            if (m % n == 0 || m > 2 * n) {
                if (!myTurn) {
                    flag = false;
                }
                break;
            }
            m -= n;
        }

        myTurn = !myTurn;
    }

    if (flag) {
        cout << "win" << endl;
    } else {
        cout << "lose" << endl;
    }

    return 0;
}
