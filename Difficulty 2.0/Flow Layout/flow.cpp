#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    while (true) {
        int width;
        cin >> width;

        if (width == 0) {
            break;
        }

        int maxW = 0;
        int maxH = 0;
        int limitW = 0;
        vector<int> heightList;

        while (true) {
            int currW, currH;
            cin >> currW;
            cin >> currH;

            if (currW == -1) {
                break;
            }

            if (limitW + currW <= width) {
                heightList.push_back(currH);
                limitW += currW;
            } else {
                // Go to the next line
                if (limitW > maxW) {
                    maxW = limitW;
                }

                limitW = currW;
                maxH += *max_element(heightList.begin(), heightList.end());
                heightList.clear();
                heightList.push_back(currH);
            }
        }

        if (limitW > maxW) {
            maxW = limitW;
        }

        maxH += *max_element(heightList.begin(), heightList.end());

        cout << maxW << " x " << maxH << endl;
    }

    return 0;
}
