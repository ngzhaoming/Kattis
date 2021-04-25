#include <iostream>

using namespace std;

int main() {
    int N;
    int total = 0;

    cin >> N;

    for (int i = 0; i < N; i++) {
        int curr;
        cin >> curr;

        total += curr;
    }

    cout << (total - N + 1) << endl;
    return 0;
}
