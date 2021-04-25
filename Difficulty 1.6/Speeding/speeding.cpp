#include <iostream>

using namespace std;

int main() {
    int N;
    float max = 0;
    float prevDist = 0;
    float prevHour = 0;

    cin >> N;

    for (int i = 0; i < N; i++) {
        float hour, currDist;
        cin >> hour;
        cin >> currDist;

        int speed = (currDist - prevDist) / (hour - prevHour);

        if (speed > max) {
            max = speed;
        }

        prevDist = currDist;
        prevHour = hour;
    }

    cout << max << endl;
    return 0;
}
