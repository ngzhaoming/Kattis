#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {
        string currStr;
        cin >> currStr;

        if (i % 2 == 0) {
            cout << currStr << endl;
        }
    }

    return 0;
}
