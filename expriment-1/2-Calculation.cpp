#include <iostream>
#include <algorithm>
using namespace std;

const int N = 100;
int a[N], f[N], n, ans;

int main(){
    cin >> n;
    for(int i = 1; i <= n; i ++){
        cin >> a[i];
    }
    for(int i = 1; i <= n; i ++){
        f[i] = max(f[i - 1] + a[i], a[i]);
        ans = max(ans, f[i]);
    }
    cout << ans;
    return 0;
}