#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<char> ans;

    for (int i = 0; i < n; i++) {
        char currAns;
        cin >> currAns;

        ans.push_back(currAns);
    }

    int total = 0;
    for (int i = 0; i < n - 1; i++) {
        char actual = ans[i];
        char hanh = ans[i + 1];

        if (actual == hanh) {
            total++;
        }
    }

    cout << total << endl;

    return 0;
}
