#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    int a, b;
    cin >> a;
    cin >> b;

    int best = max(a, (b / 2) + 1);
    int count = 0;
    bool first = true;

    for (char a = 'a'; a <= 'z'; a++) {
        for (char b = 'a'; b <= 'z'; b++) {
            for (char c = 'a'; c <= 'z'; c++) {
                for (char d = 'a'; d <= 'z'; d++) {
                    if (first) {
                        cout << a << b << c << d;
                        first = false;
                    } else {
                        cout << " " << a << b << c << d;
                    }
                    count++;

                    if (count == best) {
                        break;
                    }
                 }
                if (count == best) {
                    break;
                }
             }
            if (count == best) {
                break;
            }
        }
        if (count == best) {
            break;
        }
}

    cout << endl;

    return 0;
}
