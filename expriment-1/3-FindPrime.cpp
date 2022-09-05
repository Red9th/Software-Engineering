#include <iostream>
#include <algorithm>
using namespace std;

const int N = 110;
int n;

// 这是最费时的函数
bool is_prime(int x){ 
    if(x < 2) return false;
    for(int i = 2; i <= x / i; i ++){
        if(x % i == 0) return false;
    }
    return true;
}

int main(){
    int cnt = 0;
    for(int i = 1; i <= 20000; i ++){
        if(is_prime(i)) {
            cout << i << ' ';
            if(cnt == 4) cout << '\n';
            cnt = (cnt + 1) % 5;
        }
    }
    return 0;
}