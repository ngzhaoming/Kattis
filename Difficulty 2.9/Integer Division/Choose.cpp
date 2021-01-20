#include "Choose.h"

long Choose::fact(long n) {
    long res = 1;
    for (long i = 2; i <= n; i++) {
        res = res * i;
    }

    return res;
}

long Choose::nCr(long n, long r) {
    return fact(n) / (fact(r) * fact(n - r));
}
