package se.robinh;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        testFindByFirstName();

    }

    public static void testFindByFirstName() {
        // Test case for findByFirstName()
        NameRepository.setNames(new String[]{"Robin Homonai", "Tore Svensson", "Camilla Fredriksson"});

        String[] test1 = NameRepository.findByFirstName("Robin");
        System.out.println("Test 1 result should be [Robin Homonai]");
        System.out.println("Result of Test 1: " + Arrays.toString(test1));
    }
}
