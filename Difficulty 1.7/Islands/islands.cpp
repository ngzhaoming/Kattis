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
    int row = map.size();
    int col = map[0].size();

    int islandTotal = 0;
    queue<pair<int, int> > fillQueue;

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            char currTile = map[i][j];

            if (currTile == 'W' || currTile == 'N' || currTile == 'M') {
                 continue;
            }

            if (currTile == 'C') {
                fillQueue.push(make_pair(i, j));
                bool isIslandMade = false;
                
                while (!fillQueue.empty()) {
                    pair<int, int> currPair = fillQueue.front();
                    fillQueue.pop();

                    int k = currPair.first;
                    int l = currPair.second;

                    if (k < 0 || k >= row || l < 0 || l >= col) {
                        continue;
                    }

                    char currCharTile = map[k][l];

                    if (currCharTile == 'C') {
                        map[k][l] = 'M';
                        fillQueue.push(make_pair(k - 1, l));
                        fillQueue.push(make_pair(k, l - 1));
                        fillQueue.push(make_pair(k, l + 1));
                        fillQueue.push(make_pair(k + 1, l));
                    }

                    if (currCharTile == 'L') {
                        if (!isIslandMade) {
                            islandTotal++;
                            isIslandMade = true;
                        }

                        map[k][l] = 'N';
                        fillQueue.push(make_pair(k - 1, l));
                        fillQueue.push(make_pair(k, l - 1));
                        fillQueue.push(make_pair(k, l + 1));
                        fillQueue.push(make_pair(k + 1, l));
                    }
                }

                continue;
            }

            //Tile is Land ('L')
            //Push into the queue the parent
            fillQueue.push(make_pair(i, j)); // Push in the original
            islandTotal++; // Change to noted and increase count

            while (!fillQueue.empty()) {
                pair<int, int> currPair = fillQueue.front();
                fillQueue.pop();

                int k = currPair.first;
                int l = currPair.second;

                if (k < 0 || k >= row || l < 0 || l >= col) {
                    continue;
                }

                char currCharTile = map[k][l];

                if (currCharTile == 'L' || currCharTile == 'C') {
                    map[k][l] = 'N';
                    fillQueue.push(make_pair(k - 1, l));
                    fillQueue.push(make_pair(k, l - 1));
                    fillQueue.push(make_pair(k, l + 1));
                    fillQueue.push(make_pair(k + 1, l));
                }
            }
        }
    }

    return islandTotal;
}

int main() {
    int row, col;
    vector<string> original;
    cin >> row;
    cin >> col;

    for (int i = 0; i < row; i++) {
        string currStr;
        cin >> currStr;

        original.push_back(currStr);
    }

    int islandTotal = countIsland(original);

    cout << islandTotal << endl;

    return 0;
}
