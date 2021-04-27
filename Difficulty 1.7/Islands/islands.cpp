#include <iostream>
#include <string>
#include <vector>
#include <queue>
#include <utility>

using namespace std;

void printMap(vector<string> map) {
    for (int i = 0; i < map.size(); i++) {
        cout << map[i] << endl;
    }
}

int countIsland(vector<string> map) {
    vector<vector<bool> > mapBool;
    int row = map.size();
    int col = map[0].size();

    for (int i = 0; i < map.size(); i++) {
        vector<bool> currBool;
        for (int j = 0; j < map[0].size(); j++) {
            currBool.push_back(false);
        }

        mapBool.push_back(currBool);
    }

    int islandTotal = 0;

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            char currTile = map[i][j];
            bool currTileBool = mapBool[i][j];

            if (currTile == 'W') {
                 continue;
            }

            if (currTileBool) {
                continue;
            }

            //Tile is a new land check all 4 position if there is land that has already been set to true
            //Check all 4 adjacent positions, up, down, left, right
            bool isNewIsland = true;

            queue<pair<int, int> > fillQueue;

            for (int k = -1; k < 2; k++) {
                for (int l = -1; l < 2; l++) {
                    if (i + k < 0 || i + k >= row || j + l < 0 || j + l >= col) {
                        continue;
                    }

                    if (k == -1 && l == -1) {
                        continue;
                    }

                    if (k == -1 && l == 1) {
                        continue;
                    }

                    if (k == 0 && l == 0) {
                        continue;
                    }

                    if (k == 1 && l == -1) {
                        continue;
                    }

                    if (k == 1 && l == 1) {
                        continue;
                    }

                    char adjTile = map[i + k][j + l];
                    bool verdict = mapBool[i + k][j + l];

                    if (verdict) {
                        isNewIsland = false;
                    }

                    if (adjTile == 'L' && !verdict) {
                        mapBool[i + k][j + l] = true;
                        pair<int, int> currPair;
                        currPair.first = i + k;
                        currPair.second = j + l;

                        fillQueue.emplace(currPair)
                    }
                }
            }

            if (isNewIsland) {
                islandTotal++;
            }
        }
    }

    return islandTotal;
}

int main() {
    int row, col;
    vector<string> original;
    vector<string> water;
    vector<string> land;
    cin >> row;
    cin >> col;

    for (int i = 0; i < row; i++) {
        string currStr;
        cin >> currStr;

        original.push_back(currStr);
    }

    for (int i = 0; i < row; i++) {
        string currStr = original[i];
        string waterStr = "";
        string landStr = "";

        for (int j = 0; j < col; j++) {
            char currChar = currStr[j];

            if (currChar == 'C') {
                waterStr += 'W';
                landStr += 'L';
            } else {
                waterStr += currChar;
                landStr += currChar;
            }
        }

        water.push_back(waterStr);
        land.push_back(landStr);
    }

    int waterTotal = countIsland(water);
    int landTotal = countIsland(land);

    if (waterTotal < landTotal) {
        cout << waterTotal << endl;
    } else {
        cout << landTotal << endl;
    }

    return 0;
}
