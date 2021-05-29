#include <iostream>
#include <unordered_set>
#include <string>

using namespace std;

int main() {
    string word;
    cin >> word;
    unordered_set<char> set;

    for (int i = 0; i < word.size(); i++) {
        char currChar = word[i];
        set.insert(currChar);
    }

    if (word.size() == set.size()) {
        cout << "1" << endl;
    } else {
        cout << "0" << endl;
    }

    return 0;
}
