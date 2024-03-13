package se.robinh;

import java.util.Arrays;

// todo: Create a new class called NameRepository.
public class NameRepository {

    // todo: Inside NameRepository create a private static empty array of String called names.
    private static String[] names = new String[0];

    public static int getSize() {
        // todo: Returns number of elements in the array.
        return names.length;
    }

    public static void setNames(String[] addNames) {
        // todo: Send in an array that set the private static array. This should replace all existing names.
        names = Arrays.copyOf(addNames, addNames.length);
    }

    public static void clear() {
        // todo: Should completely empty the array.
        names = new String[0];
    }

    public static String[] findAll() {
        // todo: Return all names in a new array.
        return Arrays.copyOf(names, names.length);
    }

    public static String find(final String fullName) {
        // todo: Returns name if found and null if not found.
        for (String name : names) {
            if (name.equals(fullName)) {
                return name;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        // todo: Should add a new name to the array. Returns true when name was added and false when the array contains the name.
        for (String name : names) {
            if (name.equals(fullName)) {
                return false;
            }
        }

        String[] addNames = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            addNames[i] = names[i];
        }
        addNames[addNames.length - 1] = fullName;
        names = addNames;
        return true;
    }
}
