package May;

import java.util.HashMap;
import java.util.Map;

public class Contest_Count_Complete_Day {
    public static long countCompleteDayPairs(int[] v) {
        int n = v.length;
        long ans = 0;

        // Taking modulus 24 of each element in the array
        for (int i = 0; i < n; i++) {
            v[i] %= 24;
        }

        // Using a HashMap to store frequency of remainders
        Map<Long, Long> mp = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            if (v[i] == 0) {
                ans += mp.getOrDefault((long) v[i], 0L);
            } else {
                long rem = 24 - v[i];
                ans += mp.getOrDefault(rem, 0L);
            }
            mp.put((long) v[i], mp.getOrDefault((long) v[i], 0L) + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] hours={72,48,24,3};
        System.out.println(countCompleteDayPairs(hours));
    }
}
