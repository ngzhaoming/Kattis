#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

int main() {
    int num;
    cin >> num;

    for (int i = 0; i < num; i++) {
        double rad, iter;
        double times = 4;
        double total = 0.0;

        cout << fixed;
        cout << setprecision(6);

        cin >> rad;
        cin >> iter;

        for (int j = 0; j < iter; j++) {
            if (j == 0) {
                // This is the first iteration 
                total += (M_PI * rad * rad); 
                rad /= 2;
            } else {
                total += (M_PI * rad * rad * times);
                rad /= 2;
                times *= 3;
            }
        }

        cout << total << endl;

    }
    return 0;
}
