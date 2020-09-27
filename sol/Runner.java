package sol;


import java.text.MessageFormat;

public class Runner {
    protected static void run() {
        Solution solution = new Solution();

        int[] array = Utils.readArray(3);
        int duration = Utils.readInt();

        int answer = solution.findPoisonedDuration(array, duration);
        System.out.println(MessageFormat.format("result:\n{0}",answer));
    }
}
