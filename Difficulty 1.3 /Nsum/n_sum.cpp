#include <iostream>

using namespace std;

int main() {
    int result = 0;
    int n;

    cin >> n;

    for (int i = 0; i < n; i++) {
        int currVal;
        cin >> currVal;

        result += currVal;
    }

    cout << result << endl;
    return 0;
}
