#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    string word;
    cin >> word;
    vector<char> charArr;

    for (auto& i: word) {
        charArr.push_back(i);
    }

    int k;
    cin >> k;

    bool flag = true;

    if (k > word.size() / 2) {
        // Need to sort and check
        vector<char> sorted = charArr;
        sort(sorted.begin(), sorted.end());

        for (int j = word.size() - k; j <= k - 1; j++) {
            char wordChar = charArr[j];
            char sortedChar = sorted[j];

            if (wordChar != sortedChar) {
                flag = false;
                break;
            }
        }
    }

    if (flag) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }

    return 0;
}
