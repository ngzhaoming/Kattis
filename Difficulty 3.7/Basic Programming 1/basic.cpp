#include <iostream>
#include <algorithm>
#include <set>

using namespace std;

int main() {
    int n, t;
    cin >> n;
    cin >> t;
    long arr[n];

    for (int i = 0; i < n; i++) {
        long val;
        cin >> val;

        arr[i] = val;
    }

    int size = sizeof(arr) / sizeof(arr[0]);

    if (t == 1) {
        cout << 7 << endl;
    } else if (t == 2) {
        long a0 = arr[0];
        long a1 = arr[1];

        if (a0 > a1) {
            cout << "Bigger" << endl;
        } else if (a0 == a1) {
            cout << "Equal" << endl;
        } else {
            cout << "Smaller" << endl;
        }
    } else if (t == 3) {
        long sorted[3];
        sorted[0] = arr[0];
        sorted[1] = arr[1];
        sorted[2] = arr[2];

        sort(sorted, sorted + 3);

        cout << sorted[1] << endl;
    } else if (t == 4) {
        long total = 0;
        for (int i = 0; i < size; i++) {
            total += arr[i];
        }

        cout << total << endl;
    } else if (t == 5) {
        long total = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                total += arr[i];
            }
        }

        cout << total << endl;
    } else if (t == 6) {
        char letters [26] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        string result = "";

        for (int i = 0; i < size; i++) {
            long index = arr[i] % 26;
            result += letters[index];
        }

        cout << result << endl;
    } else {
        // This is 7
        set<int> visited;

        long index = arr[0];
        visited.insert(0);

        while (true) {
            if (index >= size || index < 0) {
                cout << "Out" << endl;
                break;
            }

            if (index == size - 1) {
                cout << "Done" << endl;
                break;
            }

            if (visited.find(index) != visited.end()) {
                cout << "Cyclic" << endl;
                break;
            }

            visited.insert(index);
            index = arr[index];
        }
    }

    return 0;
}
