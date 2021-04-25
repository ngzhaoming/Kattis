#include <iostream>

using namespace std;

int main() {
    int N, P, S;
    cin >> N;
    cin >> P;
    cin >> S;

    for (int i = 0; i < S; i++) {
        int cards;
        cin >> cards;

        bool toRemove = true;
        for (int j = 0; j < cards; j++) {
            int curr;
            cin >> curr;

            if (curr == P && toRemove) {
                toRemove = false;
            }
        }

        if (toRemove) {
            cout << "REMOVE" << endl;
        } else {
            cout << "KEEP" << endl;
        }
    }

    return 0;
}
