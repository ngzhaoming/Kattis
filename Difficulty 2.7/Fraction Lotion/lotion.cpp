#include <iostream>

using namespace std;

int main() {

    std::string line;
    while (std::getline(std::cin, line)) {
        int originalDenom = stoi(line.substr(2));

        int xDenom = originalDenom + 1;
        int unique = 0;

        while (true) {
            int numDiff = xDenom - originalDenom;
            int totalDenom = xDenom * originalDenom;

            if (numDiff > originalDenom) {
                break;
            }

            if (totalDenom % numDiff == 0.00) {
                unique++;
            }

            xDenom++;
        }

        cout << unique << endl;
    }

    return 0;
}
