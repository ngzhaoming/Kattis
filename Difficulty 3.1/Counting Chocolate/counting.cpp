#include <iostream>

using namespace std;

int main() {
    int N;
    cin >> N;
    
    int total = 0;
    for (int i = 0; i < N; i++) {
        int currVal;
        cin >> currVal;
        total += currVal;
    }
    
    if (total % 2 == 0) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
    
    return 0;
}
