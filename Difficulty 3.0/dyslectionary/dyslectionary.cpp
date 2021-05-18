#include <vector>
#include <algorithm>
#include <iostream>
#include <iomanip>

using namespace std;

void printVec(vector<string> list, int size) {
    for (int i = 0; i < list.size(); i++) {
        string currWord = list[i];
        reverse(currWord.begin(), currWord.end());

        cout << std::setw(size) << currWord << endl;
    }
}

int main() {
    string prev = "first";
    string input;

    vector<string> list;
    int length = 0;

    while(true) {
        getline(cin, input);

        if (input == "") { //This is end of the testcase
            sort(list.begin(), list.end());
            printVec(list, length);

            list.clear();
            length = 0;
        } else {
            if (prev == "") {
                cout << endl;
            }

            reverse(input.begin(), input.end());

            if (input.size() > length) {
                length = input.size();
            }

            list.push_back(input);
        }

        if (prev == "" && input == "") {
            break;
        }

        prev = input;
    }

    return 0;
}
