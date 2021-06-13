#include <iostream>
#include <unordered_set>
#include <vector>

using namespace std;

int main() {
    unordered_set<int> id;

    int n;
    cin >> n;

    vector<int> list;

    for (int i = 0; i < n; i++) {
        int currNum;
        cin >> currNum;
        list.push_back(currNum);
    }

    int counter = n;

    while (true) {
        for (int i = 0; i < n; i++) {
            int currNum = list[i] % counter;
            id.insert(currNum);

            if (id.size() < i + 1) {
                break;
            }
        }

        if (id.size() == n) {
            break;
        }

        id.clear();
        counter++;
    }

    cout << counter << endl;
    return 0;
}
