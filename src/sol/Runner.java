package sol;


import java.text.MessageFormat;

public class Runner {
    protected static void run() {
        Solution solution = new Solution();

        int[] customers = Utils.readArray(2);
        int boardingCost = Utils.readInt();
        int runningCost = Utils.readInt();
        int answer = solution.minOperationsMaxProfit(customers, boardingCost, runningCost);
        System.out.println(MessageFormat.format("result:\n{0}",answer));
    }
}
