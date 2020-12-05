#include <iostream>

using namespace std;

int main() {
    int x;
    cin >> x; 

    if (x % 2 == 0) {
        cout << "Alice\n";
        cout << x / 2 << endl;
    } else {
        cout << "Bob\n";
    }

    return 0;
}
