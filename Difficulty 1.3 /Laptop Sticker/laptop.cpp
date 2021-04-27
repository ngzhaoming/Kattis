#include <iostream>

using namespace std;

int main() {
    int lapW, lapH, stickW, stickH;

    cin >> lapW;
    cin >> lapH;
    cin >> stickW;
    cin >> stickH;

    bool verdict = true;

    if (lapW - 2 < stickW) {
        verdict = false;
    }

    if (lapH - 2 < stickH) {
        verdict = false;
    }

    cout << verdict << endl;
    return 0;
}
