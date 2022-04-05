package cz.acamar.tasks;

import java.util.Arrays;

/**
 * Main program method
 * An example of how the lengthOfLastWord() and squaresOfSortedArray() methods work
 */
public class Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        String str1 = "   fly me   to   the moon  ";
        String str2 = null;
        String str3 = "Write Once Run Anywhere";

        System.out.println("An example of how the lengthOfLastWord() method works\n");
        System.out.println("The length of last word in string \"" + str1 + "\" is " + task1.lengthOfLastWord(str1));
        System.out.println("********************************************************");
        System.out.println("The length of last word in string " + str2 + " is " + task1.lengthOfLastWord(str2));
        System.out.println("********************************************************");
        System.out.println("The length of last word in string \"" + str3 + "\" is " + task1.lengthOfLastWord(str3));

        int[] array = new int[]{-4, -1, 0, 3, 10};
        int[] emptyArray = new int[0];
        int[] nullArray = null;

        System.out.println("\n\nAn example of how the squaresOfSortedArray() method works\n");
        System.out.println("Array {-4, -1, 0, 3, 10}  --->  " +
                Arrays.toString(task2.squaresOfSortedArray(array)));
        System.out.println("********************************************************");
        System.out.println("Empty array  --->  " +
                Arrays.toString(task2.squaresOfSortedArray(emptyArray)));
        System.out.println("********************************************************");
        System.out.println("Null array  --->  " +
                Arrays.toString(task2.squaresOfSortedArray(nullArray)));
    }
}
