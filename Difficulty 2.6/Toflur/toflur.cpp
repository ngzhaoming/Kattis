#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {
    long long N;
    cin >> N;
    vector<long long> list;

    for (long long i = 0; i < N; i++) {
        long long currVal;
        cin >> currVal;

        list.push_back(currVal);
    }

    sort(list.begin(), list.end());

    long long total = 0;
    long long prev = list[0];
    for (long long i = 1; i < N; i++) {
        long long currVal = list[i];
        long long diff = currVal - prev;

        total += pow(diff, 2);
        prev = currVal;
    }

    cout << total << endl;

    return 0;
}
