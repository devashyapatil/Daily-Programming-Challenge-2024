import java.util.ArrayList;
import java.util.List;

class Day17 {
    public static List<Integer> primeFactors(int N) {
        int n = N;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
