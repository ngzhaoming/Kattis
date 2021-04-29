#include <iostream>
#include <string>
#include <cctype>
#include <algorithm>
#include <unordered_set>
#include <vector>

using namespace std;

std::string trim(std::string s) {
	std::string whitespace = " \t\n\r\f\v";

	// Trim from end of string (right)
	std::string result = s.erase(s.find_last_not_of(whitespace) + 1);

	// Trim from beginning of string (left) 
	result = result.erase(0, result.find_first_not_of(whitespace));
	return result;
}

std::vector<std::string> split(std::string s, std::string delimiter) {
	std::vector<std::string> result;

	if (delimiter.length() == 0) {
		result.push_back(s);
		return result;
	}

	size_t startPos = 0;
	size_t endPos = 0;

	while ((endPos = s.find(delimiter, startPos)) != std::string::npos) {
		std::string clause = trim(s.substr(startPos, endPos - startPos));
		result.push_back(clause);

		startPos = endPos + delimiter.size();
	}

	result.push_back(trim(s.substr(startPos)));

	return result;
}

int main() {
    string casesStr;
    int N;
    unordered_set<string> conclusions;

    getline(cin, casesStr);
    N = stoi(casesStr);

    bool isCorrect = true;

    for (int i = 0; i < N; i++) {
        string currStr;
        getline(cin, currStr);

        vector<string> parts = split(currStr, "->");        

        string LHS = parts[0];
        string RHS = parts[1];

        vector<string> assumptions = split(LHS, " ");
        
        bool isTrue = true;
        for (int j = 0; j < assumptions.size(); j++) {
            string currAssumption = assumptions[j];
            if (currAssumption == "") {
                continue;
            }

            if (conclusions.find(currAssumption) == conclusions.end()) {
                isTrue = false;
                break;
            }
        }

        if (isTrue) {
            conclusions.insert(RHS);
        } else {
            cout << i + 1 << endl;
            isCorrect = false;
            break;
        }
    }

    if (isCorrect) {
        cout << "correct" << endl;
    }
    
    return 0;
}
