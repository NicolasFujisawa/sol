package sol;


import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int answer = -1, n = customers.length;
        Queue<Integer> wheel = new ArrayDeque<>();

        int arrived = 0;
        int profit = 0, shift = 0;
        int onBoard = 0, rote = 0;
        do {
            if(rote < n) {
                arrived += customers[rote++];
            }
            onBoard += Math.min(arrived, 4);
            shift++;

            if (profit < (onBoard * boardingCost - shift * runningCost)) {
                answer = shift;
            }
            profit = Math.max(profit, onBoard * boardingCost - shift * runningCost);

            wheel = shift(Math.min(arrived, 4), wheel);
            arrived -= Math.min(arrived, 4);
        } while(arrived > 0 || rote < n);

        return answer;
    }

    public Queue<Integer> shift(int toBoard, Queue<Integer> wheel) {
        if(wheel.size() >= 4) {
            wheel.remove();
        }
        wheel.add(toBoard);
        return wheel;
    }
}