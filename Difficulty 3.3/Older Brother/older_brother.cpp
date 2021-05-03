#include <iostream>
#include <cmath>

using namespace std;

bool isPrime(long n) {
    bool isPrime = true;

    if (n == 0 || n == 1) {
        isPrime = false;
    } else if (n == 2) {
        isPrime = true;
    } else {
        long upperbound = sqrt(n) + 1;

        for (long i = 2; i <= upperbound; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    return isPrime;
}

int main() {
    long q;
    cin >> q;

    if (isPrime(q)) {
        cout << "yes" << endl;
    } else if (q == 1) {
        cout << "no" << endl;
    } else {
        long upperbound = sqrt(q) + 1; 
        bool hasAnswer = false;

        for (int i = 2; i <= upperbound; i++) {
            if (!isPrime(i)) {
                continue;
            }

            long currVal = i;
            long total = 0;
            long counter = 2;
            while (total < q) {
                total = pow(currVal, counter);
                counter++;
            }

            if (total == q) {
                hasAnswer = true;
                break;
            }
        }

        if (hasAnswer) {
            cout << "yes" << endl;
        } else {
            cout << "no" << endl;
        }
    }

    return 0;
}
