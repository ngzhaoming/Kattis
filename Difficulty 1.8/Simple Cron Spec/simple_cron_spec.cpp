#include <iostream>
#include <string>
#include <unordered_set>
#include <vector>
#include <algorithm>

using namespace std;

void printvec(vector<string> vec) {
    for (int i = 0; i < vec.size(); i++) {
        cout << vec[i] << endl;
    }
}

void printintvec(vector<int> vec) {
    for (int i = 0; i < vec.size(); i++) {
        cout << vec[i] << endl;
    }
}

vector<string> split(string s, string delimiter) {
	vector<string> result;

	if (delimiter.length() == 0) {
		result.push_back(s);
		return result;
	}

	size_t startPos = 0;
	size_t endPos = 0;

	while ((endPos = s.find(delimiter, startPos)) != string::npos) {
		string clause = s.substr(startPos, endPos - startPos);
		result.push_back(clause);

		startPos = endPos + 1;
	}

	result.push_back(s.substr(startPos));

	return result;
}

int main() {
    int N;
    int totalJobs = 0;
    unordered_set<int> timeCount;
    cin >> N;

    for (int i = 0; i < N; i++) { // Start of a new cron job
        vector<int> hrVec;
        vector<int> minVec;
        vector<int> secVec;
        string hr, min, sec;

        cin >> hr;
        cin >> min;
        cin >> sec;

        vector<string> hrSplit = split(hr, ",");        
        vector<string> minSplit = split(min, ",");        
        vector<string> secSplit = split(sec, ",");        

        for (int j = 0; j < hrSplit.size(); j++) {
            string currStr = hrSplit[j];
            vector<string> currStrArr = split(currStr, "-");

            if (currStrArr[0] == "*") {
                for (int k = 0; k < 24; k++) {
                    hrVec.push_back(k);
                }
            } else if (currStrArr.size() > 1) {
                for (int k = stoi(currStrArr[0]); k <= stoi(currStrArr[1]); k++) {
                    hrVec.push_back(k);
                }
            } else {
                hrVec.push_back(stoi(currStrArr[0]));
            }
        }

        for (int j = 0; j < minSplit.size(); j++) {
            string currStr = minSplit[j];
            vector<string> currStrArr = split(currStr, "-");

            if (currStrArr[0] == "*") {
                for (int k = 0; k < 60; k++) {
                    minVec.push_back(k);
                }
            } else if (currStrArr.size() > 1) {
                for (int k = stoi(currStrArr[0]); k <= stoi(currStrArr[1]); k++) {
                    minVec.push_back(k);
                }
            } else {
                minVec.push_back(stoi(currStrArr[0]));
            }
        }

        for (int j = 0; j < secSplit.size(); j++) {
            string currStr = secSplit[j];
            vector<string> currStrArr = split(currStr, "-");

            if (currStrArr[0] == "*") {
                for (int k = 0; k < 60; k++) {
                    secVec.push_back(k);
                }
            } else if (currStrArr.size() > 1) {
                for (int k = stoi(currStrArr[0]); k <= stoi(currStrArr[1]); k++) {
                    secVec.push_back(k);
                }
            } else {
                secVec.push_back(stoi(currStrArr[0]));
            }
        }

        for (int j = 0; j < hrVec.size(); j++) {
            int currHr = hrVec[j] * 3600;
            for (int k = 0; k < minVec.size(); k++) {
                int currMin = minVec[k] * 60;
                for (int l = 0; l < secVec.size(); l++) {
                    int currSec = secVec[l];

                    int currTiming = currHr + currMin + currSec;

                    timeCount.insert(currTiming);
                }
            }
        }

        totalJobs += (hrVec.size() * minVec.size() * secVec.size());
    }

    cout << timeCount.size() << " " << totalJobs << endl;

    return 0;
}
