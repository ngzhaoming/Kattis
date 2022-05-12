#include <iostream>

using namespace std;

int main() {
	int centerX, centerY, radius;

	cin >> centerX;
	cin >> centerY;
	cin >> radius;

	cout << (centerX + radius) << " " << (centerY + radius) << endl;
	cout << (centerX + radius) << " " << (centerY - radius) << endl;
	cout << (centerX - radius) << " " << (centerY - radius) << endl;
	cout << (centerX - radius) << " " << (centerY + radius) << endl;

	return 0;
}
