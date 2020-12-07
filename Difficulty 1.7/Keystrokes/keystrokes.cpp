#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    cin >> str;

    string result = "";
    string token = "";

    int cursor = 0;
    for (char x: str) {
        // This is a command
        if (x == 'L') {
            cursor--;
        } else if (x == 'R') {
            cursor++;
        } else if (x == 'B') {
            // This is backspace
            result.erase(cursor - 1, 1);
            cursor--;
        } else {
            string first = result.substr(0, cursor);
            string second = result.substr(cursor);

            result = first + x + second;
            cursor++;
        }
    }

    cout << result << endl;


    return 0;
}
