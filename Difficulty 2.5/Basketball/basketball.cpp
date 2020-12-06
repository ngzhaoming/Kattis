#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

int main() {
    unordered_map<string, int> players;
    string delimit = " ";

    int num, limit, lines;
    cin >> num;
    cin >> limit;
    cin >> lines;

    for (int i = 0; i < num; i++) {
        string name;
        cin >> name;

        players[name] = 0;
    }

    int counter = 0;
    for (int i = 0; i < lines; i++) {
        string name;
        int score;
        cin >> name;
        cin >> score;

        int currVal = players.at(name);
        
        if (currVal == -1) {
            continue;
        }

        currVal += score;

        if (currVal >= limit) {
            counter++;
            cout << name << " wins!" << endl;
            players.at(name) = -1;
        } else {
            players.at(name) = currVal;
        }
    }

    if (counter == 0) {
        cout << "No winner!" << endl;
    }
    return 0;
}
