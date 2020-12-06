#include <iostream>
#include <string>
#include <list>
#include <unordered_map>

using namespace std;

class person {
    public:
        string name;
        int val;
        string bday;
};

int main() {
    int num;
    cin >> num;
    unordered_map<string, person> bdMap;

    for (int i = 0; i < num; i++) {
        string name;
        int val;
        string bday;

        cin >> name;
        cin >> val;
        cin >> bday;

        person curr;
        curr.name = name;
        curr.val = val;
        curr.bday = bday;

        if (bdMap.find(bday) == bdMap.end()) {
            bdMap[bday] = curr;
        } else {
            person contender = bdMap.at(bday);
            if (contender.val < curr.val) {
                bdMap.at(bday) = curr;
            }
        }
    }

    list<string> nameList;
    for (auto& it: bdMap) {
        nameList.push_back(it.second.name);
    }

    nameList.sort();
    cout << nameList.size() << endl;

    for (auto& it: nameList) {
        cout << it << endl;
    }

    return 0;
}

