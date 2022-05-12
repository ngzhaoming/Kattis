#include <iostream>
#include <vector>

using namespace std;

void printVec(vector<int> vec) {
	for (int i: vec) {
		cout << i << endl;
	}
}

int main() {
	vector<int> ans;

	int n, m;
	cin >> n;
	cin >> m;

	for (int i = 0; i <= n; i++) {
		ans.push_back(-i);
	}

	for (int i = 0; i < m; i++) {
		int first, second;
		cin >> first;
		cin >> second;

		ans[first]++;
		ans[second]++;
	}

	for (int i = 1; i <= n; i++) {
		if (i == n) {
			cout << ans[i] << endl;
		} else {
			cout << ans[i] << " ";
		}
	}
	return 0;
}
