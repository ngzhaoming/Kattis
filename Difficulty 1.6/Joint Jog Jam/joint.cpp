#include <math.h>
#include <iostream>

using namespace std;

double dist(double a, double b, double c, double d) {
	double ans = 0;
	ans = sqrt(pow((a - c), 2) + pow((b - d), 2));

	return ans;
}

int main() {
	double kariStartX, kariStartY, olaStartX, olaStartY;
	double kariEndX, kariEndY, olaEndX, olaEndY;

	cin >> kariStartX;
	cin >> kariStartY;
	cin >> olaStartX;
	cin >> olaStartY;
	cin >> kariEndX;
	cin >> kariEndY;
	cin >> olaEndX;
	cin >> olaEndY;

	double ans = 0;

	double first = dist(kariStartX, kariStartY, olaStartX, olaStartY);
	if (first > ans) {
		ans = first;
	}

	double second = dist(kariEndX, kariEndY, olaEndX, olaEndY);
	if (second > ans) {
		ans = second;
	}

	cout << ans << endl;
	return 0;
}
