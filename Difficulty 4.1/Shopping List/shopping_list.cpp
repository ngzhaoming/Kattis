#include <iostream>
#include <unordered_map>
#include <string>
#include <vector>
#include <unordered_set>
#include <algorithm>

using namespace std;

bool alphaSort(string a, string b) {
    return a < b;
}

int main() {
    int N, M;
    unordered_map<string, int> list; 

    cin >> N;
    cin >> M;

    for (int i = 0; i < N; i++) {
        unordered_set<string> purchased;
        for (int j = 0; j < M; j++) {
            string currProd;
            cin >> currProd;

            if (purchased.find(currProd) == purchased.end()) {
                list[currProd]++;
                purchased.insert(currProd);
            }
        }
    }

    vector<string> products;
    for (auto& it: list) {
        if (it.second == N) {
            products.push_back(it.first);
        }
    }

    sort(products.begin(), products.end(), alphaSort);
    cout << products.size() << endl;

    for (int i = 0; i < products.size(); i++) {
        cout << products[i] << endl;
    }
    return 0;
}
