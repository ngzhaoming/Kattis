#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int N, index;
    cin >> N;
    cin >> index;
    vector<int> list;

    for (int i = 0; i < N; i++) {
        int currVal;
        cin >> currVal;

        list.push_back(currVal);
    }

    int currTime = list[index];
    list.erase(list.begin() + index);
    sort(list.begin(), list.end());

    int totalTime = 0;
    int totalQns = 0;

    if (currTime <= 300) { //Check first question
        totalTime = currTime;    
        totalQns++;
    }

    for (int i = 0; i < N - 1; i++) {
        int nextTime = list[i];
        currTime += nextTime;

        if (currTime > 300) {
            break;
        }

        totalTime += currTime;
        totalQns++;
    }

    cout << totalQns << " " << totalTime << endl;

    return 0;
}
