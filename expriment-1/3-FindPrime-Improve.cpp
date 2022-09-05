#include <iostream>
using namespace std;

const int N = 1e6 + 10;
int primes[N], idx;
bool st[N];

int main(){
    // 改进方法：使用朴素筛筛掉每个数的倍数
    for(int i = 2; i <= 20000; i++){
        if(!st[i]){
            st[i] = true;
            primes[idx ++] = i;
        }   
        for(int j = i + i; j <= 20000; j += i) st[j] = true;
    }
    int cnt = 0;
    for(int i = 0; i < idx; i ++){
        cout << primes[i] << ' ';
        if(cnt == 4) cout << '\n';
        cnt = (cnt + 1) % 5;
    }
    return 0;
}