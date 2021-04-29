#include <iostream>
#include <vector>

using namespace std;

int countIsland(vector<int> list) {
    int minVal = list[0];
    int size = list.size();

    for (int i = 0; i < size; i++) {
        if (list[i] < minVal) {
            minVal = list[i];
        }
    }

    for (int i = 0; i < size; i++) {
        list[i] -= minVal;
    }

    for (int i = 0; i < size; i++) {
        int currVal = list[i];
        if (currVal != 0) {
            break;
        }

        if (i == size - 1 && currVal == 0) {
            return 0;
        }
    }

    vector<vector<int> > islands;
    vector<int> initSet;
    islands.push_back(initSet);


    for (int i = 0; i < size; i++) {
        int currVal = list[i];
        if (currVal != 0) {
            islands[islands.size() - 1].push_back(currVal);
        } else {
            vector<int> newSet;
            islands.push_back(newSet);
        }
    }

    int totalIsland = 0;

    for (int i = 0; i < islands.size(); i++) {
        vector<int> currSet = islands[i];
        if (currSet.size() != 0) {
            totalIsland++;
            totalIsland += countIsland(currSet);
        }
    }

    return totalIsland;
}

int main() {
    int N;
    cin >> N;

    while (true) {
        int i;
        cin >> i;
        vector<int> list;

        for (int j = 0; j < 12; j++) {
            int currVal;
            cin >> currVal;
            list.push_back(currVal);
        }

        int totalIsland = countIsland(list);

        cout << i << " ";
        cout << totalIsland << endl;
        
        if (i == N) {
            break;
        }
    }

    return 0;
}
