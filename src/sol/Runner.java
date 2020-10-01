package sol;


import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Runner {
    private static final Logger LOGGER = Logger.getLogger( Runner.class.getName() );

    private Runner() {
        throw new IllegalStateException("Utility class");
    }

    protected static void run() {
        Solution solution = new Solution();

        int[] nums = Utils.readArray(3);
        LOGGER.log(Level.INFO, "random array {0}",Arrays.toString(nums));

        int answer = solution.firstMissingPositive(nums);
        LOGGER.log(Level.INFO, "result {0}", answer);
    }
}
