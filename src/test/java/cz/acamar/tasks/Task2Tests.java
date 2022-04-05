package cz.acamar.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task2Tests {

    private final Task2 task2 = new Task2();

    @Test
    void testCase1() {
        int[] input = new int[]{-4, -1, 0, 3, 10};
        int[] expected = new int[]{0, 1, 9, 16, 100};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void testCase2() {
        int[] input = new int[]{-7, -3, 2, 3, 11};
        int[] expected = new int[]{4, 9, 9, 49, 121};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void squaresOfSortedArrayIfArgumentIsEmptyArray() {
        int[] input = new int[0];
        int[] expected = new int[0];

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void squaresOfSortedArrayIfArgumentIsNull() {
        int[] input = null;
        int[] expected = new int[]{-1};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

}
