package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order.
     *          If an array with one value -1 is returned,
     *          then null was passed to the method arguments.
     */
    public int[] squaresOfSortedArray(int[] input) {
        if (!(input == null)) {
            if (input.length == 0){
                return input;
            } else {
                //result array
                int[] res = new int[input.length];
                //pointers for left and right
                int leftPointerPos = 0; int rightPointerPos = input.length - 1;
                //iterate from n to 0
                for (int i = input.length - 1; i >= 0; i--) {
                    //check if abs left is less than or equal to abs right
                    if (Math.abs(input[leftPointerPos]) >= Math.abs(input[rightPointerPos])) {
                        //add left squared to result array
                        res[i] = input[leftPointerPos] * input[leftPointerPos];
                        //increment left pointer
                        leftPointerPos++;
                    } else {
                        //add right squared to result array
                        res[i] = input[rightPointerPos] * input[rightPointerPos];
                        //decrement right pointer
                        rightPointerPos--;
                    }
                }
                return res;
            }
        }
        return new int[]{-1};
    }
}
