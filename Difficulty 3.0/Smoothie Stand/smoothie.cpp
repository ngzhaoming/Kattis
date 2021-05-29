#include <iostream>
#include <vector>

using namespace std;

int main() {
    int ingredients, n;
    cin >> ingredients;
    cin >> n;

    vector<int> quantity;

    for (int i = 0; i < ingredients; i++) {
        int currQuantity;
        cin >> currQuantity;

        quantity.push_back(currQuantity);
    }

    int max = 0;
    int limit = INT_MAX;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < ingredients; j++) {
            int currQuantity;
            cin >> currQuantity;

            int floor = limit;

            if (currQuantity != 0) {
                floor = quantity[j] / currQuantity;
            }

            if (floor < limit) {
                limit = floor;
            }
        }

        int price;
        cin >> price;

        int temp = limit * price;

        if (temp > max) {
            max = temp;
        }

        limit = INT_MAX;
    }

    cout << max << endl;
    return 0;
}
