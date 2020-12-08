#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

#define ll long long

using namespace std;

int main() {
    int num;
    cin >> num;

    for (int i = 0; i < num; i++) {
        int lines;
        cin >> lines;

        vector<ll> rank;

        for (int j = 0; j < lines; j++) {
            string name;
            ll pos;
            cin >> name;
            cin >> pos;
            rank.push_back(pos);
        }

        sort(rank.begin(), rank.end());

        ll counter = 1;
        ll total = 0;
        for (auto& x: rank) {
            total += abs(counter - x);
            counter++;
        }

        cout << total << endl;
    }
    return 0;
}
