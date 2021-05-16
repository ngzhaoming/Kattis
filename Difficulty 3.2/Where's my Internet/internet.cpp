#include <iostream>
#include <unordered_map>
#include <unordered_set>
#include <queue>

using namespace std;

int main() {
    unordered_map<int, unordered_set<int> > adjMatrix;

    int N, M;
    cin >> N; //Number of towns
    cin >> M; //Number of edges

    for (int i = 0; i < M; i++) {
        int v1, v2;
        cin >> v1;
        cin >> v2;

        adjMatrix[v1].insert(v2);
        adjMatrix[v2].insert(v1);
    }

    //Conduct BFS from node 1
    queue<int> frontier;
    unordered_set<int> explored;
    frontier.push(1);

    while (!frontier.empty()) {
        int currNode = frontier.front();
        frontier.pop();
        explored.insert(currNode);

        unordered_set<int> adjSet = adjMatrix[currNode];
        for (int i:adjSet) {
            if (explored.find(i) != explored.end()) {
                //This is explored before
                continue;
            }

            frontier.push(i);
            explored.insert(i);
        }
    }

    if (explored.size() == N) {
        cout << "Connected" << endl;
    } else {
        for (int i = 1; i <= N; i++) {
            if (explored.find(i) == explored.end()) {
                cout << i << endl;
            }
        }
    }

    return 0;
}
