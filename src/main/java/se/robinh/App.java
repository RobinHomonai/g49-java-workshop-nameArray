package se.robinh;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        runTest();
    }

    public static void runTest() {
        testFindByFirstName();
        testFindByLastName();
    }

    public static void testFindByFirstName() {
        // Test case for findByFirstName()
        NameRepository.setNames(new String[]{"Robin Homonai", "Tore Svensson", "Camilla Fredriksson"});

        String[] test1 = NameRepository.findByFirstName("Robin");
        System.out.println("Test 1 result should be [Robin Homonai]");
        System.out.println("Result of Test 1: " + Arrays.toString(test1));

        String[] test2 = NameRepository.findByFirstName("Kamilla");
        System.out.println("Test 2 result should be []");
        System.out.println("Result of Test 2: " + Arrays.toString(test2));
    }

    public static void testFindByLastName() {
        // Test case for findByLastName()
        NameRepository.setNames(new String[]{"Robin Homonai", "Tore Svensson", "Svenne Svensson", "Camilla Fredriksson"});

        String[] test1 = NameRepository.findByLastName("Homonai");
        System.out.println("Test 1 is set to Homonai");
        System.out.println("Test 1 result should be [Robin Homonai]");
        System.out.println("Result of Test 1: " + Arrays.toString(test1));

        String[] test2 = NameRepository.findByLastName("Svensson");
        System.out.println("Test 2 is set to Svensson");
        System.out.println("Test 2 result should be [Tore Svensson ,Svenne Svensson]");
        System.out.println("Result of Test 2: " + Arrays.toString(test2));

        String[] test3 = NameRepository.findByLastName("Henriksson");
        System.out.println("Test 3 is set to Henriksson");
        System.out.println("Test 3 result should be an empty array, []");
        System.out.println("Result of Test 3: " + Arrays.toString(test3));
    }
}
