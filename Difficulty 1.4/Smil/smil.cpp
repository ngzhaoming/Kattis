#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    cin >> str;

    int index = 0;
    string currStr = "";

    for (int i = 0; i < str.length(); i++) {
        char currChar = str.at(i);

        if (currStr == ":" || currStr == ";") {
            if (currChar == '-') {
                currStr += currChar;
            } else if (currChar == ')') {
                cout << index << endl;
                currStr = "";
            } else {
                currStr = "";
            }
        } else if (currStr == ":-" || currStr == ";-") {
            if (currChar == ')') {
                cout << index << endl;
                currStr = "";
            } else {
                currStr = "";
            }
        }
        
        if (currChar == ':' || currChar == ';') {
            currStr = "";
            currStr += currChar;
            index = i;
        }
    }
}
