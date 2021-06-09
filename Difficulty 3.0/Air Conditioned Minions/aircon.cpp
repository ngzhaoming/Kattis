#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

struct minion {
    int min;
    int max;
};

bool compareLimits(minion m1, minion m2) {
    if (m1.max == m2.max) {
        return m1.min < m2.min;
    }

    return m1.max < m2.max;
}

int main() {
    int n;
    cin >> n;
    vector<minion> list;

    for (int i = 0; i < n; i++) {
        minion currMinion;

        int min, max;
        cin >> min;
        cin >> max;

        currMinion.min = min;
        currMinion.max = max;

        list.push_back(currMinion);
    }

    sort(list.begin(), list.end(), compareLimits);

    int total = 1;
    int currMax = list[0].max;

    for (int i = 1; i < list.size(); i++) {
        minion currMinion = list[i];
        int currMin = currMinion.min;

        if (currMin > currMax) {
            total++;
            currMax = currMinion.max;
        }
    }

    cout << total << endl;

    return 0;
}
