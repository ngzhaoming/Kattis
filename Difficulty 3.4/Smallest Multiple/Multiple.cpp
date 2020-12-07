#include <iostream>
#include <vector>
#include <sstream>
#include <fstream>

using namespace std; 
  
typedef long long int ll; 
  
int gcd(ll a, ll b) { 
    if (b == 0) {
        return a;
    }

    return gcd(b, a % b); 
} 
  
ll findlcm(vector<ll> arr, int size) { 
    ll ans = arr.at(0); 
  
    for (int i = 1; i < size; i++) {
        ans = (((arr.at(i) * ans)) / 
                (gcd(arr.at(i), ans))); 
    }
  
    return ans; 
} 
  
int main() { 
    string delimit = " ";
    string str;


    while(getline(cin, str)) {
        vector<ll> arr;

        size_t pos = 0;
        string token;
        while ((pos = str.find(delimit)) != string::npos) {
            token = str.substr(0, pos);

            ll x = 0;
            x = stoll(token, nullptr, 10);
            arr.push_back(x);

            str.erase(0, pos + delimit.length());
        }

        ll x = 0;
        x = stoll(str, nullptr, 10);
        arr.push_back(x);

        ll result = findlcm(arr, arr.size());

        cout << result << endl;
    }

    return 0; 
} 
