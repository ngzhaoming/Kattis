#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
#include <climits>

using namespace std;

void printVec(vector<int> v) {
    for (int i = 0; i < v.size(); i++) {
        cout << v[i] << " ";
    }

    cout << endl;
}

int main() {    
    int people, tree;
    cin >> people;
    cin >> tree;

    vector<int> pList;
    vector<int> tList;
    vector<bool> taken;

    for (int i = 0 ; i < people; i++) {
        int currVal;
        cin >> currVal;

        pList.push_back(currVal);
    }

    for (int i = 0 ; i < tree; i++) {
        int currVal;
        cin >> currVal;

        tList.push_back(currVal);
        taken.push_back(false);
    }

    sort(pList.begin(), pList.end());
    sort(tList.begin(), tList.end());

    int total = 0;
    int currIndex = 0;

    for (int i = 0; i < pList.size(); i++) {
        int currPerson = pList[i];
        int minDist = INT_MAX;

        for (int j = currIndex; j < tList.size(); j++) {
            int currTree = tList[j];
            int diff = abs(currTree - currPerson);

            if (diff < minDist) {
                currIndex = j;
                minDist = diff;
            }
        }

        if (taken[currIndex]) {
            total++;
        } else {
            taken[currIndex] = true;
        }
    }

    cout << total << endl;

    return 0;
}
