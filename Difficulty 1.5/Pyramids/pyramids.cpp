#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    int level = 0;
    int total = 0;
    int currLevel = 1;

    while (total <= n) {
        int required = pow(currLevel, 2);
        total += required;
        if (total <= n) {
            currLevel += 2;
            level++;
        }
    }

    cout << level << endl;

    return 0;
}
