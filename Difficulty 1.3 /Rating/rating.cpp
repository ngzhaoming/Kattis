#include <iostream>

using namespace std;

int main() {
    double n, m;
    cin >> n;
    cin >> m;
    
    double currTotal = 0;
    for (int i = 0; i < m; i++) {
        double currVal;
        cin >> currVal;
        currTotal += currVal;
    }
    
    double min = currTotal;
    double max = currTotal;
    
    for (int i = 0; i < n - m; i++) {
        min += -3;
        max += 3;
    }
    
    cout << min / n << " " << max / n << endl;
    
    return 0;
}
