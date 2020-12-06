#include <iostream>
#include <string>
#include <unordered_map>
#include <map>
#include <set>
#include <algorithm>

using namespace std;

int main() {
    int num;
    cin >> num;
    map<string, int> numCourse;
    unordered_map<string, set<string> > person;

    for (int i = 0; i < num; i++) {
        string first;    
        string second;    
        string course;    

        cin >> first;
        cin >> second;
        cin >> course;

        string curr = first + " " + second;

        if (person.find(curr) != person.end()) {
            set<string> currSet = person.at(curr); 

            if (currSet.find(course) != currSet.end()) {
                continue;
            }

            currSet.insert(course);
            person.at(curr) = currSet;
        } else {
            // The person is not even in the map
            set<string> currSet;
            currSet.insert(course);

            person[curr] = currSet;
        }

        if (numCourse.find(course) != numCourse.end()) {
            int currVal = numCourse.at(course);
            numCourse.at(course) = currVal + 1;
        } else {
            numCourse[course] = 1;
        }
    }

    for (auto& x: numCourse) {
        cout << x.first << " " << x.second << endl;        
    }

    return 0;
}
