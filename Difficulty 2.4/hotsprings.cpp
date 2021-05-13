#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

void printVec(vector<int> vec) {
    for (int i = 0; i < vec.size(); i++) {
        if (i == vec.size() - 1) {
            cout << vec[i] << endl;
        } else {
            cout << vec[i] << " ";
        }
    }
}

int main() {
    int N;
    cin >> N;

    vector<int> list;
    vector<int> result;
    for (int i = 0; i < N; i++) {
        int currVal;
        cin >> currVal;
        list.push_back(currVal);
    }

    sort(list.begin(), list.end());

    int leftPointer = (N - 1) / 2; //This will move towards the front
    int rightPointer = leftPointer + 1; //This will move towards the end
    if (N % 2 == 0) {
        while (leftPointer >= 0 && rightPointer <= N) {
            result.push_back(list[leftPointer]);
            result.push_back(list[rightPointer]);
            leftPointer--;
            rightPointer++;
        }
    } else {
        result.push_back(list[leftPointer]);
        leftPointer--;

        while (leftPointer >= 0 && rightPointer <= N) {
            result.push_back(list[leftPointer]);
            result.push_back(list[rightPointer]);
            leftPointer--;
            rightPointer++;
        }
    }

    printVec(result);

    return 0;
}
