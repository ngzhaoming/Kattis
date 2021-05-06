#include <iostream>
#include <vector>

using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> dist;

    for (int i = 0 ; i < N; i++) {
        int currDist;
        cin >> currDist;

        dist.push_back(currDist);
    }

    int min = INT_MAX;

    for (int i = 0; i < N; i++) {
        int firstDist = dist[i];
        int lastPerson = i - 2;

        if (lastPerson < 0) {
            lastPerson = (lastPerson + N) % N;
        }

        int lastDist = dist[lastPerson];
        int total = lastDist + firstDist;

        if (total < min) {
            min = total;
        }
    }

    cout << min << endl;

    return 0;
}
