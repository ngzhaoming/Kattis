#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

void printDetails(long long pointer, long long firstTotal, long long secondTotal, long long max) {
    cout << "pointer: " << pointer << endl;
    cout << "first total: " << firstTotal << endl;
    cout << "second total: " << secondTotal << endl;
    cout << "max: " << max << endl;
}

int main() {
    long long N;
    long long max = 0;
    long long firstTotal = 0;
    long long secondTotal = 0;
    long long pointer = 1;
    vector<int> numList;

    cin >> N;

    for (int i = 0; i < N; i++) {
        long long currNum;
        cin >> currNum;
        numList.push_back(currNum);

        if (i == 0) {
            firstTotal = pow(currNum, 2); 
        } else {
            secondTotal += currNum;
        }
    }

    max = firstTotal * secondTotal;

    while (pointer < N - 1) {
        long long currVal = numList[pointer];
        firstTotal  = firstTotal + pow(currVal, 2);
        secondTotal = secondTotal - currVal;

        long long newTotal = firstTotal * secondTotal;

        if (newTotal > max) {
            max = newTotal;
        }
        pointer++;
    }

    cout << max << endl;
    return 0;
}
