package se.robinh;

import org.w3c.dom.ls.LSOutput;

public class NameRepository {

    private static String[] names = new String[0];

    public static int getSize() {
        return names.length;
    }

    public static void setNames(String[] names) {
        // todo: Send in an array that set the private static array. This should replace all existing names.
    }

    public static void clear() {
        // todo: Should completely empty the array.
    }

    public static String[] findAll() {
        // todo: Return all names in a new array.
        return null;
    }
}
