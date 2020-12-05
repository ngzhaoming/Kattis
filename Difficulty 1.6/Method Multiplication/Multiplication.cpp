#include <iostream>
#include <string>

using namespace std;

int main() {
    string x, y;
    cin >> x;
    cin >> y;

    int l1 = (x.length() - 1) / 3;
    int l2 = (y.length() - 1) / 3;
    int total = l1 * l2;

    string result;

    for (int i = 0; i < total; i++) {
        result.append("S(");
    }

    result.append("0");

    for (int i = 0; i < total; i++) {
        result.append(")");
    }

    cout << result << "\n";

    return 0;
}
