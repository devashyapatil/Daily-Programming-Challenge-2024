class Day29 {
    static int nthFibonacci(int n) {
        if (n <= 1) return n;

        int curr = 0;
        int prev1 = 1;
        int prev2 = 0;

        for (int i=2; i<=n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}
