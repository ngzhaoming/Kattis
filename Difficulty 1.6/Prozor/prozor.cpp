#include <iostream>
#include <string>
#include <vector>

using namespace std;

void printVec(vector<string> map) {
    for (int i = 0; i < map.size(); i++) {
        cout << map[i] << endl;
    }
}

int main() {
    int height, width, size;
    cin >> height;
    cin >> width;
    cin >> size;

    vector<string> map;

    for (int i = 0; i < height; i++) {
        string currStr;
        cin >> currStr;

        map.push_back(currStr);
    }

    int max = 0;
    int rowBest = 0;
    int colBest = 0;

    for (int i = 0; (i + size - 1) < height; i++) { //Gets the currRow
        for (int j = 0; (j + size - 1) < width; j++) { //Gets the currCol
            int currTotal = 0;

            for (int k = i + 1; k < (i + size - 1); k++) {
                for (int l = j + 1; l < (j + size - 1); l++) {
                    char currChar = map[k][l];
                    if (currChar == '*') {
                        currTotal++;
                    }
                }
            }

            if (currTotal > max) {
                max = currTotal;
                rowBest = i;
                colBest = j;
            }
        }
    }

    cout << max << endl;

    for (int i = rowBest; i < rowBest + size; i++) {
        for (int j = colBest; j < colBest + size; j++) {
            if (i == rowBest && j == colBest) {
                map[i][j] = '+';
                continue;
            }

            if (i == rowBest && j == colBest + size - 1) {
                map[i][j] = '+';
                continue;
            }

            if (i == rowBest + size - 1 && j == colBest) {
                map[i][j] = '+';
                continue;
            }

            if (i == rowBest + size - 1 && j == colBest + size - 1) {
                map[i][j] = '+';
                continue;
            }

            if (i == rowBest || i == rowBest + size - 1) {
                map[i][j] = '-';
            }

            if (j == colBest || j == colBest + size - 1) {
                map[i][j] = '|';
            }
        }
    }

    printVec(map);

    return 0;
}
