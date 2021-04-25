#include <iostream>
#include <vector>
#include <string>

using namespace std;

void printMatrix(vector<vector<int> > vec, int size) {
    for (int i = 0; i < size; i++) {
        vector<int> currVec = vec[i];
        for (int j = 0; j < size; j++) {
            cout << currVec[j] << " ";
        }

        cout << endl;
    }
}

int main() {
    int size;

    while (true) {
        cin >> size;

        if (size == -1) {
            break;
        }

        vector<vector<int> > adjMatrix;
        vector<bool> boolArr;

        for (int i = 0; i < size; i++) {
            vector<int> currRow;

            for (int j = 0; j < size; j++) {
                int val;
                cin >> val;

                currRow.push_back(val);
            }

            adjMatrix.push_back(currRow);
            boolArr.push_back(false);
        }
        
        int counter = 0;

        while (counter < size) {
            if (boolArr[counter]) {
                counter++;
                continue;
            }

            vector<int> currRow = adjMatrix[counter]; 

            for (int i = 0; i < size; i++) {
                if (currRow[i] == 0) {
                    continue;
                }

                for (int j = i + 1; j < size; j++) {
                    if (currRow[j] == 0) {
                        continue;
                    }

                    if (adjMatrix[i][j] == 1) {
                        boolArr[counter] = true;
                        boolArr[i] = true;
                        boolArr[j] = true;
                    }
                }
            }

            counter++;
        }

        string result = "";
        for (int i = 0; i < size; i++) {
            if (!boolArr[i]) {
                result = result + to_string(i) + " ";
            }
        }

        cout << result.substr(0, result.size() - 1) << endl;
    }


    return 0;
}

