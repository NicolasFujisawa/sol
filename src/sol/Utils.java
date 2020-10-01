package sol;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Utils {
    private static final Logger LOGGER = Logger.getLogger( Utils.class.getName() );

    private static final Random random = new Random();

    private Utils() {
        throw new IllegalStateException("Utility class");
    }

    public static int[] randomArray(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; ++i) {
            array[i] = random.nextInt(max) + min;
        }
        return array;
    }

    public static int[] readArray(int length) {
        LOGGER.log(Level.INFO, "array of length {0}:", length);
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < length; ++i) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static double[] readDoubleArray(int length) {
        LOGGER.log(Level.INFO, "array of length {0}:", length);
        double[] array = new double[length];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < length; ++i) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    public static int readInt() {
        LOGGER.log(Level.INFO, "reading int");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String[] readStringArray(int length) {
        LOGGER.log(Level.INFO, "reading array of length {0}:", length);
        String[] array = new String[length];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < length; ++i) {
            array[i] = scanner.next();
        }
        return array;
    }

    public static List<List<String>> readStringMatriz(int length, int iLength) {
        List<List<String>> matriz = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            matriz.add(Arrays.asList(Utils.readStringArray(iLength)));
        }
        return matriz;
    }
}
