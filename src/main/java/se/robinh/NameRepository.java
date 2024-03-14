package se.robinh;

import java.util.Arrays;

// Create a new class called NameRepository.
public class NameRepository {

    // Inside NameRepository create a private static empty array of String called names.
    private static String[] names = new String[0];

    public static int getSize() {
        // Returns number of elements in the array.
        return names.length;
    }

    public static void setNames(String[] addNames) {
        // Send in an array that set the private static array. This should replace all existing names.
        names = Arrays.copyOf(addNames, addNames.length);
    }

    public static void clear() {
        // Should completely empty the array.
        names = new String[0];
    }

    public static String[] findAll() {
        // Return all names in a new array.
        return Arrays.copyOf(names, names.length);
    }

    public static String find(final String fullName) {
        // Returns name if found and null if not found.
        for (String name : names) {
            if (name.equals(fullName)) {
                return name;
            }
        }
        return null;
    }

    public static String[] findByFirstName(final String firstName) {
        // Searches the array trying to find all names that has passed in first name.
        // Returns a String array containing all matches.
        String[] matchingNames = new String[0];
        for (String name : names) {
            String[] nameSplit = name.split(" ");
            if (nameSplit.length >= 1 && nameSplit[0].equals(firstName)) {
                matchingNames = Arrays.copyOf(matchingNames, matchingNames.length + 1);
                matchingNames[matchingNames.length - 1] = name;
            }
        }
        return matchingNames;
    }


    public static String[] findByLastName(final String lastName) {
        // Searches the array trying to find all names that has passed in last name.
        // Returns a String array containing all matches.
        String[] matchingNames = new String[0];
        for (String name : names) {
            String[] nameSplit = name.split(" ");
            if (nameSplit.length >= 2 && nameSplit[1].equals(lastName)) {
                matchingNames = Arrays.copyOf(matchingNames, matchingNames.length + 1);
                matchingNames[matchingNames.length - 1] = name;
            }
        }
        return matchingNames;
    }

    public static boolean update(final String original, final String updatedName) {
        // Should find a name and replace it with the new fullName if available.
        // Returns true if name was found and updated with the new name.
        // False if name could not be updated because name wasn't found or name was found but an existing name matching the updatedName already exists.
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(original)) {
                if (find(updatedName) != null || !original.equals(updatedName)) {
                    return false;
                }
                names[i] = updatedName;
                return true;
            }
        }
        return false;
    }

    public static boolean add(final String fullName) {
        //  Should add a new name to the array.
        //  Returns true when name was added and false when the array contains the name.
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

    public static boolean remove(final String fullName) {
        // todo: Should remove a name from the array.
        //  Returns true if name was removed and false if the name was not removed for some reason.

        return false;
    }
}