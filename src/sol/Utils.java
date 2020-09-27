package sol;

import static java.lang.Math.random;

import java.text.MessageFormat;
import java.util.Scanner;


public class Utils {
    public static int[] randomArray(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; ++i) {
            array[i] = (int) ((random() * ((max - min) + 1)) + min);
        }
        return array;
    }
    public static int[] readArray(int length) {
        System.out.println(MessageFormat.format("array of length {0}:", length));
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < length; ++i) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int readInt() {
        System.out.println("int:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String[] readStringArray(int length) {
        System.out.println(MessageFormat.format("array of string length {0}:", length));
        String[] array = new String[length];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < length; ++i) {
            array[i] = scanner.next();
        }
        return array;
    }
}
