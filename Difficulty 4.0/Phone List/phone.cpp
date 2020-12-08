#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int num;
    cin >> num;

    for (int i = 0; i < num; i++) {
        int n;
        cin >> n;

        vector<string> phonelist; 

        for (int j = 0; j < n; j++) {
            string currNum;
            cin >> currNum;

            phonelist.push_back(currNum);
        }

        sort(phonelist.begin(), phonelist.end());

        bool flag = true;
        for (int i = 0; i < phonelist.size() - 1; i++) {
            string curr = phonelist.at(i);
            string next = phonelist.at(i + 1);

            if (next.rfind(curr, 0) == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }

    return 0;
}
