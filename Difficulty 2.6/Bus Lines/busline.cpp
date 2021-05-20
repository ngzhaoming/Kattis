#include <unordered_set>
#include <string>
#include <iostream>

using namespace std;

int main() {
    int n, m;
    cin >> n;
    cin >> m;

    if (m < n - 1) {
        cout << "-1" << endl;
        return 0;
    }

    unordered_set<int> sum;
    unordered_set<string> busLines;

    for (int i = 1; i < n; i++) {
        int currSum = i + (i + 1);
        sum.insert(currSum);

        string currStr = to_string(i) + " " + to_string(i + 1);

        busLines.insert(currStr);
    }

    unordered_set<string> extras;
    for (int i = 1; i <= n; i++) {
        for (int j = i + 2; j <= n; j++) {
            int currSum = i + j;

            if (sum.find(currSum) == sum.end()) {
                sum.insert(currSum);
                string currStr = to_string(i) + " " + to_string(j);
                extras.insert(currStr);
            }
        }
    }

    
    int counter = m - n + 1;
    if (extras.size() < counter) {
        cout << "-1" << endl;
        return 0;
    }

    for (string s: busLines) {
        cout << s << endl;
    }


    for (string s: extras) {
        if (counter <= 0 ) {
            break;
        }

        cout << s << endl;
        counter--;
    }

    return 0;
}
