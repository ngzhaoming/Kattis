#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n, m;
    cin >> n;
    cin >> m;
    vector<int> myList;
    
    myList.push_back(n);
    myList.push_back(m);
    sort(myList.begin(), myList.end());

    cout << myList[0] << " " << myList[1] << endl;
    return 0;
}
