#include <bits/stdc++.h>

using namespace std;

int main() {
  int n[10];
  for(int i = 0; i < 10; i++) {
    cin >> n[i];
    if(n[i] <= 0) {n[i] = 1;}
  }
  for(int i = 0; i < 10; i++){
    cout << "X[" << i << "] = " << n[i] << endl;
  }
}
