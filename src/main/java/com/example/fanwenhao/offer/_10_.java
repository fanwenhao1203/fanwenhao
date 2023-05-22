package com.example.fanwenhao.offer;

public class _10_ {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i ++) {
            int tmp = a;
            a = b;
            b = tmp + b;
        }
        return b % 1000000007;
    }
}
