#include <iostream>
#include <unordered_map>

using namespace std;

int main() {
    int room;
    int team;
    unordered_map<int, string> result;

    cin >> room;
    cin >> team;

    for (int i = 0; i < room; i++) {
        result[i] = "";
    }

    int key = 0;
    int count = 0;
    while (count < team) {
        string curr = result.at(key);
        curr += "*";
        result.at(key) = curr; 

        key = (key + 1) % room;
        count++;
    }

    for (auto& x: result) {
        cout << x.second << endl;
    }

    return 0;
}
