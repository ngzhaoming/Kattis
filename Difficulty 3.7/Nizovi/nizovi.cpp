#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    cin >> str;

    string indent = "";
    int counter = 0;
    char prev = '.';
    for (auto& x: str) {
        if (x == '{') {
            cout << indent << '{' << endl;
            indent += "  ";
        } else if (x == ',') {
            cout << ',' << endl;
            counter = 0;
        } else if (x == '}') {
            indent.erase(0, 2);
            if (counter > 0) {
                // End the word
                cout << endl;
                counter = 0;
            }
            if (prev == '}') {
                cout << endl;
            }
            cout << indent << '}';
        } else {
            if (counter == 0) {
                cout << indent << x;
            } else {
                cout << x;
            }
            counter++;
        }

        prev = x;
    }

    cout << endl;

    return 0;
}
