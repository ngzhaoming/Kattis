#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <unordered_set>

using namespace std;

bool sortWord(string s1, string s2) {
    if (s1.size() == s2.size()) {
        return s1 > s2;
    }

    return s1.size() < s2.size();
}

bool checkValid(string currWord) {
    unordered_set<char> letters;

    if (currWord.size() < 5) {
        return false;
    }

    for (int i = 0; i < currWord.size(); i++) {
        char currChar = currWord[i];
        letters.insert(currChar);
    }

    if (letters.size() != currWord.size()) {
        return false;
    }

    return true;
}

int main() {
    int N;
    cin >> N;
    vector<string> validWords;

    for (int i = 0; i < N; i++) {
        string currWord;
        cin >> currWord;

        if (checkValid(currWord)) {
            validWords.push_back(currWord);
        }
    }

    sort(validWords.begin(), validWords.end(), sortWord);

    if (validWords.size() == 0) {
        cout << "neibb!" << endl;
    } else {
        cout << validWords[0] << endl;
    }

    return 0;
}
