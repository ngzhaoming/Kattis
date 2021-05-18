#include <iostream>
#include <unordered_set>
#include <unordered_map>

using namespace std;

int main() {
    int people, nights;
    cin >> people;
    cin >> nights;

    unordered_map<int, unordered_set<int> > list;
    int counter = 1;

    for (int i = 0; i < nights; i++) {
        int N;
        cin >> N;
        unordered_set<int> currList;

        for (int j = 0; j < N; j++) {
            int currPerson;
            cin >> currPerson;

            currList.insert(currPerson);
        }

        if (currList.find(1) != currList.end()) {
            //Bard is here
            for (int j: currList) {
                unordered_set<int> currSet = list[j];
                currSet.insert(counter);
                list[j] = currSet;
            }

            counter++;
        } else {
            //Each person to share song and merge set
            unordered_set<int> newSet;

            for (int j: currList) {
                unordered_set<int> currSet = list[j];
                newSet.insert(currSet.begin(), currSet.end());
            }

            for (int j: currList) {
                list[j] = newSet;
            }
        }
    }

    for (int i = 1; i <= people; i++) {
        unordered_set<int> currSet = list[i];
        if (currSet.size() == counter - 1) {
            cout << i << endl;
        }
    }

    return 0;
}
