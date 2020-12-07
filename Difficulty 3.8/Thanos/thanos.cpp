#include <iostream>

using namespace std;

int main() {
    int size;
    cin >> size;

    long arr [size];

    for (int i = 0; i < size; i++) {
        long num;
        cin >> num;

        arr[i] = num;
    }

    if (size > 1) {
        long total = 0;
        bool flag = true;
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[i] - 1;
                total++;
            }

            if (arr[i] > arr[i + 1]) {
                long diff = arr[i] - arr[i + 1] + 1;
                total += diff;
                arr[i] = arr[i] - diff;
            }

            if (arr[i + 1] == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            cout << total << endl;
        } else {
            cout << 1 << endl;
        }
    } else {
        // There is only 1 universe
        cout << 0 << endl;
    }

    return 0;
}
