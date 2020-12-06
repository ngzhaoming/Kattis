#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector<long> timings;
    int num;
    cin >> num;

    for (int i = 0; i < num; i++) {
        int curr;
        cin >> curr;

        timings.push_back(curr);
    }

    sort(timings.begin(), timings.end());

    long total = 0;

    for (int i = 0; i < timings.size() - 1; i++) {
        total += timings.at(i);
    }

    if (total <= timings.back()) {
        cout << timings.back() * 2 << endl;
    } else {
        cout << timings.back() + total << endl;
    }

    return 0;
}
