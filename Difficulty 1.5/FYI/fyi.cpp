#include <iostream>
#include <string>

using namespace std;

int main() {
    int inpt;
    string strInpt;

    cin >> inpt;
    strInpt = to_string(inpt);

    int index = strInpt.find("555");

    if (index == 0) {
        cout << 1 << endl;
    } else {
        cout << 0 << endl;
    }
    return 0;
}
