#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    string str;
    cin >> str;
    int size = str.size();

    for (int i = 1; i <= size; i++) {
        if (size % i != 0) {
            continue;
        }

        if (i == size) {
            cout << i << endl;
            break;
        }

        vector<string> substring;
        for (int j = 0; j < size; j += i) {
            string sub = str.substr(j, i);
            substring.push_back(sub);
        }

        string prev = substring[0];
        bool isPossible = true;
        for (int j = 1; j < substring.size(); j++) {
            string curr = substring[j];

            string mutate = prev.back() + prev.substr(0, prev.size() - 1);
            prev = curr;

            if (mutate != curr) {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            cout << i << endl;
            break;
        }
    }

    return 0;
}
