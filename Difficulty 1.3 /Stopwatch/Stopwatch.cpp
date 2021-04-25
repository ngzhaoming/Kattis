#include <iostream>

using namespace std;

int main() {
    int times;

    cin >> times;
    
    if (times % 2 != 0) {
        for (int i = 0; i < times; i++) {
            int dummy;
            cin >> dummy;
        }
        cout << "still running" << endl;
        return 0;
    }

    int total = 0;
    for (int i = 0; i < times; i = i + 2) {
        int first, second;
        cin >> first;
        cin >> second;
        total += (second - first); 
    }

    cout << total << endl;
    return 0;
}
