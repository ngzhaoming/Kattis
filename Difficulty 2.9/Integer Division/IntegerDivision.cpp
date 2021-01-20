#include <iostream>
#include <unordered_map>

using namespace std;

int main() {
    unordered_map<long, long> map;

    long n, divisor;
    cin >> n;
    cin >> divisor;

    for (int i = 0; i < n; i++) {
        long curr;
        cin >> curr;

        long quotion = curr / divisor;

        if (map.find(quotion) == map.end()) {
            map[quotion] = 1;
        } else {
            long value = map[quotion];
            map[quotion] = value + 1;
        }
    }

    long total = 0;
    // Iterating the values in the map
    unordered_map<long, long>:: iterator it;

    for (it = map.begin(); it != map.end(); it++) {
        long value = it->second;
        total += (value * (value - 1) / 2);
    }

    cout << total << endl;
    return 0;
}
