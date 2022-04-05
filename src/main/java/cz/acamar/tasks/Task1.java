package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string. If -1 is returned,
     * then null was passed to the method arguments.
     */
    public int lengthOfLastWord(String str) {
        if (!(str == null)) {
            if (!str.isEmpty()) {
                boolean charFlag = false;
                int count = 0;
                for (int i = str.length() - 1; i >= 0; i--) {
                    if (Character.isLetter(str.charAt(i))) {
                        // Once the first character from last
                        // is encountered, set charFlag to true.
                        charFlag = true;
                        count++;
                    } else {
                        // When the first space after the characters
                        // (from the last) is encountered, return the
                        // length of the last word
                        if (charFlag)
                            return count;
                    }
                }
                return count;
            }
            return 0;
        }
        return -1;
    }
}
