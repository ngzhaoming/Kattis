#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int len;
    string str;

    cin >> len;
    cin >> str;

    vector<char> vec;
    reverse(str.begin(), str.end());

    for (char& x: str) {
        vec.push_back(x);
    }

    sort(vec.begin(), vec.end());
    string oppStr = "";
    string myStr = "";

    while (!vec.empty()) {
        char opp = str.at(0);
        vec.erase(find(vec.begin(), vec.end(), opp));
        str.erase(str.begin());

        char best = vec.at(0);
        vec.erase(vec.begin());
        str.erase(find(str.begin(), str.end(), best));

        oppStr += opp;
        myStr += best;
    }

    if (myStr < oppStr) {
        cout << "DA" << endl;
    } else {
        cout << "NE" << endl;  
    }
    cout << myStr << endl;
    return 0;
}
