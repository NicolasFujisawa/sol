package sol;


public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if (n == 0 || duration == 0) return 0;
        int answer = 0;
        for(int i = 1; i < n; ++i) {
            answer += Math.min(timeSeries[i] - timeSeries[i - 1], duration);
        }
        return answer + duration;
    }
}
