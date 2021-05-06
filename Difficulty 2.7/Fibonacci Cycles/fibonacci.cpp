#include <iostream>
#include <unordered_map>

using namespace std;

int main() {
    long long N;
    cin >> N;

    for (long long i = 0; i < N; i++) {
        long long mod;
        cin >> mod;

        unordered_map<long long, long long> modMap; //Key=mod, value=index

        long long prev = 1;
        long long now = 1;
        long long idx = 2;

        while (true) {
            long long currVal = prev + now;
            prev = now;
            now = currVal;
            long long currMod = currVal % mod;
            
            if (modMap.find(currMod) == modMap.end()) {
                modMap[currMod] = idx;
            } else { //Cycle found
                long long resultIdx = modMap[currMod];
                cout << resultIdx << endl;
                break;
            }

            idx++;
        }
    }

    return 0;
}
