#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

void findInfectionRate(unordered_map<string, float> map) {
    float NN = map["NN"];
    float NY = map["NY"];
    float YN = map["YN"];
    float YY = map["YY"];

    float infectionN = NY / (NY + NN);
    float infectionY = YY / (YN + YY);

    if (infectionY >= infectionN) {
        cout << "Not Effective" << endl;
    } else {
        cout << (infectionN - infectionY) / infectionN * 100 << endl;
    }
}

int main() {
    int N;
    cin >> N;

    unordered_map<string, float> a;
    unordered_map<string, float> b;
    unordered_map<string, float> c;

    for (int i = 0; i < N; i++) {
        string currString;
        cin >> currString;

        char isVaccinated = currString[0];
        string aResult = std::string(1, isVaccinated) + currString[1];
        string bResult = std::string(1, isVaccinated) + currString[2];
        string cResult = std::string(1, isVaccinated) + currString[3];

        a[aResult]++;
        b[bResult]++;
        c[cResult]++;
    }

    findInfectionRate(a);
    findInfectionRate(b);
    findInfectionRate(c);

    return 0;
}
