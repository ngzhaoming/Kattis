#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    vector<int> marks;
    
    for (int i = 0; i < 5; i++) {
        int currMarks;
        cin >> currMarks;

        marks.push_back(currMarks);
    }

    int given;
    int result = 5;
    vector<string> grade = {"A", "B", "C", "D", "E", "F"};

    cin >> given;

    for (int i = 0; i < marks.size(); i++) {
        if (given >= marks[i]) {
            result = i;
            break;
        }
    }
    cout << grade[result] << endl;

    return 0;
}
