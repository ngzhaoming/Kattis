#include <iostream>

using namespace std;

int main() {
    int x = 1;
    int prev = 1;
    cout << x;
    cout << endl;
    
    while (true) {
        prev = x;
        cin >> x;
        if (x == 99) {
            break;
        }

        int temp1 = x + 1;
        int temp2 = x + 2;
        int temp3 = x + (x - prev);

        if (temp1 % 3 == 0) {
            cout << temp1; 
        } else if (temp2 % 3 == 0) {
            cout << temp2;
        } else {
            cout << temp2;
        }

        cout << endl;

        if (x == 99) {
            break;
        }
    }

    return 0;
}
