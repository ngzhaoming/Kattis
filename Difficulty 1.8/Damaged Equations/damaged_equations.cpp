#include <iostream>
#include <string>

using namespace std;

int main() {
    int a, b, c, d;

    cin >> a;
    cin >> b;
    cin >> c;
    cin >> d;

    int total = 0;

    if (a * b == c * d) {
        cout << a << " * " << b << " = " << c << " * " << d << endl; 
        total++;
    }

    if (a * b == c + d) {
        cout << a << " * " << b << " = " << c << " + " << d << endl; 
        total++;
    }

    if (a * b == c - d) {
        cout << a << " * " << b << " = " << c << " - " << d << endl; 
        total++;
    }

    if (d != 0 && a * b == c / d) {
        cout << a << " * " << b << " = " << c << " / " << d << endl; 
        total++;
    }

    if (a + b == c * d) {
        cout << a << " + " << b << " = " << c << " * " << d << endl; 
        total++;
    }

    if (a + b == c + d) {
        cout << a << " + " << b << " = " << c << " + " << d << endl; 
        total++;
    }

    if (a + b == c - d) {
        cout << a << " + " << b << " = " << c << " -  " << d << endl; 
        total++;
    }

    if (d != 0 && a + b == c / d) {
        cout << a << " + " << b << " = " << c << " / " << d << endl; 
        total++;
    }

    if (a - b == c * d) {
        cout << a << " - " << b << " = " << c << " * " << d << endl; 
        total++;
    }

    if (a - b == c + d) {
        cout << a << " - " << b << " = " << c << " + " << d << endl; 
        total++;
    }

    if (a - b == c - d) {
        cout << a << " - " << b << " = " << c << " - " << d << endl; 
        total++;
    }

    if (d != 0 && a - b == c / d) {
        cout << a << " - " << b << " = " << c << " / " << d << endl; 
        total++;
    }

    if (b != 0 && a / b == c * d) {
        cout << a << " / " << b << " = " << c << " * " << d << endl; 
        total++;
    }

    if (b != 0 && a / b == c + d) {
        cout << a << " / " << b << " = " << c << " + " << d << endl; 
        total++;
    }

    if (b != 0 && a / b == c - d) {
        cout << a << " / " << b << " = " << c << " - " << d << endl; 
        total++;
    }

    if (b != 0 && d != 0 && a / b == c / d) {
        cout << a << " / " << b << " = " << c << " / " << d << endl; 
        total++;
    }

    if (total == 0) {
        cout << "problems ahead" << endl;
    }

    return 0;
}
