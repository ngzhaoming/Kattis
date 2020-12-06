#include <iostream>
#include <list>

using namespace std;

int main() {
    list<int> vec;

    int num;
    cin >> num;

    for (int i = 0; i < num; i++) {
        int curr;
        cin >> curr;

        vec.push_front(curr);
    }

    for (auto& x: vec) {
        cout << x << endl;
    }

    return 0;
}
