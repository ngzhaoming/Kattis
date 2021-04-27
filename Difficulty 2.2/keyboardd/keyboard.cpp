#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

int main() {
    string original, typed;
    unordered_map<char, int> originalMap;
    unordered_map<char, int> typedMap;

    getline(cin, original);
    getline(cin, typed);

    for (int i = 0; i < original.size(); i++) {
        char currChar = original[i];
        originalMap[currChar]++;
    }

    for (int i = 0; i < typed.size(); i++) {
        char currChar = typed[i];
        typedMap[currChar]++;
    }

    for (auto& it: originalMap) {
        int originalVal = it.second;
        int typedVal = typedMap[it.first];

        if (typedVal > originalVal) {
            cout << it.first;
        }
    }

    cout << endl;

    return 0;
}
