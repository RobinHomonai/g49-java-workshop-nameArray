package se.robinh;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[0];

    public static int getSize() {
        return names.length;
    }

    public static void setNames(String[] additionalNames) {
        // todo: Send in an array that set the private static array. This should replace all existing names.
        names = Arrays.copyOf(additionalNames, additionalNames.length);
    }

    public static void clear() {
        // todo: Should completely empty the array.
        names = new String[0];
    }

    public static String[] findAll() {
        // todo: Return all names in a new array.
        return Arrays.copyOf(names, names.length);
    }
}
