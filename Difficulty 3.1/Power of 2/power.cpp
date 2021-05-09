#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int main() {
    long long n, e;
    cin >> n;
    cin >> e;

    long long powerSub = pow(2, e);
    string substring = to_string(powerSub);

    int total = 0;
    for (int i = 0; i <= n; i++) {
        string currStr = to_string(i);
        
        if (currStr.find(substring) != std::string::npos) {
            total++;
        }
    }

    cout << total << endl;

    return 0;
}
