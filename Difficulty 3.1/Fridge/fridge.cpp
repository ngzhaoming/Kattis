#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    string given;
    cin >> given;

    vector<int> counter;

    for (int i = 0; i < 10; i++) {
        counter.push_back(0);
    }

    for (int i = 0; i < given.size(); i++) {
        int index = given[i] - '0';

        if (index == 0) {
            index = 10;
        }

        counter[index - 1]++;
    }

    auto it = find(counter.begin(), counter.end(), 0);
    if (it != counter.end()) {
        int index = it - counter.begin();
        cout << index + 1 << endl;
    } else {
        int minIndex = min_element(counter.begin(), counter.end()) - counter.begin();

        string result = "";
        if (minIndex == 9) {
            result += "1";

            for (int i = 0; i <= counter[minIndex]; i++) {
                result = result + "0";
            }
        } else {
            string minStr = to_string(minIndex + 1);

            for (int i = 0; i <= counter[minIndex]; i++) {
                result = result + minStr;
            }
        }

        cout << result << endl;
    }

    return 0;
}
