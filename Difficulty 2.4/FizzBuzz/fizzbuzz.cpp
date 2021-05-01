#include <iostream>
#include <string>

using namespace std;

int main() {
    int candidates, N;
    cin >> candidates;
    cin >> N;
    int max = -1;
    int best = 1;

    for (int i = 1; i <= candidates; i++) {
        int total = 0;
        for (int j = 1; j <= N; j++) {
            string currVal;
            cin >> currVal;

            if (j % 15 == 0) {
                if (currVal == "fizzbuzz") {
                    total++;
                }
            } else if (j % 3 == 0) {
                if (currVal == "fizz") {
                    total++;
                }
            } else if (j % 5 == 0) {
                if (currVal == "buzz") {
                    total++;
                }
            } else {
                if (currVal == to_string(j)) {
                    total++;
                }
            }
        }

        if (total > max) {
            max = total;
            best = i;
        }
    }

    cout << best << endl;
    return 0;
}
