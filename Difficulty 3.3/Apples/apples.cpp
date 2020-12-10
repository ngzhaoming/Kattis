#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector< vector<char> > transpose(vector< vector<char> > vec1, vector< vector<char> > vec2) {
    for (int i = 0; i < vec1.size(); i++) {
        for (int j = 0; j < vec1.at(0).size(); j++) {
            vec2[j][i] = vec1[i][j];
        }
    }

    return vec2;
}

void printVec(vector< vector<char> > vec) {
    for (int i = 0; i < vec.size(); i++) {
        for (int j = 0; j < vec.at(0).size(); j++) {
            cout << vec[i][j];
        }
        cout << endl;
    }
}

int main() {
    int row, col;
    cin >> row;
    cin >> col;
    vector< vector<char> > original;

    original.resize(row, vector<char>(col));
    for (int i = 0; i < row; i++) {
        string curr;
        cin >> curr;

        for (int j = 0; j < col; j++) {
            original[i][j] = curr.at(j);
        }
    }

    vector< vector<char> > flip;
    flip.resize(col, vector<char>(row));

    flip = transpose(original, flip);

    for (int i = 0; i < col; i++) {
        vector<int> pos;
        pos.push_back(-1);

        for (int j = 0; j < row; j++) {
            if (flip[i][j] == '#') {
                pos.push_back(j);
            }
        }

        pos.push_back(row);

        for (int k = 0; k < pos.size() - 1; k++) {
            sort(flip[i].begin() + pos[k] + 1, flip[i].begin() + pos[k + 1]);
        }
    }

        
    original = transpose(flip, original);
    printVec(original);

    return 0;
}
