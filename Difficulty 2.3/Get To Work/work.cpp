#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_map>

using namespace std;

void printVec(vector<int> list) {
    for (int i = 1; i <= list.size() - 1; i++) {
        if (i == list.size() - 1) {
            cout << list[i];   
        } else {
            cout << list[i] << " ";   
        }
    }
    cout << endl;
}

int main() {
    int N;
    cin >> N;

    for (int i = 1; i <= N; i++) {
        int towns, location, employee;
        cin >> towns;
        cin >> location;
        cin >> employee;

        vector<int> employeeNum;
        for (int j = 0; j <= towns; j++) {
            employeeNum.push_back(0);
        }

        unordered_map<int, vector<int> > driver;

        for (int j = 0; j < employee; j++) {
            int currTown, currDrive;
            cin >> currTown;
            cin >> currDrive;

            employeeNum[currTown]++;
            vector<int> currList = driver[currTown];
            currList.push_back(currDrive);
            driver[currTown] = currList;
        }

        vector<int> cars;
        for (int j = 0; j <= towns; j++) {
            cars.push_back(0);
        }

        bool globalFlag = true; // Assume that all can go
        for (int j = 1; j <= towns; j++) {
            if (j == location) {
                continue; // Can just walk there
            }
            
            int total = 0;
            vector<int> currList = driver[j];
            sort(currList.begin(), currList.end(), greater<int>());

            int currNum = employeeNum[j];
            int totalDone = 0;

            for (int k = 0; k < currList.size(); k++) {
                int currDriver = currList[k];
                totalDone += currDriver;
                total++;

                if (totalDone >= currNum) {
                    break;
                }

                if (k == currList.size() - 1 && totalDone < currNum) {
                    globalFlag = false;
                }
            }

            cars[j] = total;
        }

        if (globalFlag) {
            cout << "Case #" << i << ": ";
            printVec(cars);
        } else {
            cout << "Case #" << i << ": IMPOSSIBLE" << endl;
        }
    }

    return 0;
}
