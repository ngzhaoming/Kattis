#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

int main() {
    int n;
    cin >> n;
    cout << fixed;
    cout << setprecision(6);

    for (int i = 0; i < n; i++) {
        double rad;
        int points;
        
        cin >> rad >> points;

        double total = 0;
        double x1, y1, xPrev, yPrev;

        cin >> x1 >> y1;
        xPrev = x1;
        yPrev = y1;
        double diffX, diffY;

        for (int j = 0; j < points - 1; j++) {
            double currX, currY; 
            cin >> currX >> currY;

            diffX = currX - xPrev;
            diffY = currY - yPrev;

            xPrev = currX;
            yPrev = currY;

            total += sqrt(pow(diffX, 2) + pow(diffY, 2));
        }

        diffX = x1 - xPrev;
        diffY = y1 - yPrev;
        total += sqrt(pow(diffX, 2) + pow(diffY, 2));

        double scale = (total - 2 * M_PI * rad) / total;

        if (scale < 0) {
            cout << "Not possible" << endl;
        } else {
            cout << scale << endl;
        }
    }

    return 0;
}
