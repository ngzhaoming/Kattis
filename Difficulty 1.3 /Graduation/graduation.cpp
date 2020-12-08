#include <iostream>
#include <string>
#include <set>
#include <algorithm>

using namespace std;

int main() {
    int row, col, classes;
    cin >> row;
    cin >> col;
    cin >> classes;

    string flip[col];

    for (int i = 0; i < col; i++) {
        flip[i] = "";
    }

    for (int i = 0; i < row; i++) {
        string str;
        cin >> str;

        for (int j = 0; j < col; j++) {
            string currStr = flip[j];
            flip[j] = currStr + str[j];
        }
    }

    int size = sizeof(flip) / sizeof(flip[0]);

    set<char> assigned;
    int prev = assigned.size();
    int total = 0;

    for (int i = 0; i < size; i++) {
        string currStr = flip[i];
        set<char> curr;

        for (auto& x: currStr) {
            curr.insert(x);
        }

        for (auto& x: curr) {
            assigned.insert(x);
        }

        if (assigned.size() - prev == curr.size()) {
            total++;
        }

        prev = assigned.size();
    }

    cout << total << endl;

    return 0;
}
