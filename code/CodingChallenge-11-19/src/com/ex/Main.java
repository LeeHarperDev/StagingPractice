package com.ex;

public class Main {
    public static void main(String[] args) {

        // areNumbersAscending call.
        boolean ascendingTest = areNumbersAscending("272830");

        // Test output of areNumbersAscending.
        System.out.println(ascendingTest);

        // squarePatch call.
        int[][] intArr = squarePatch(5);

        // Test output for squarePatch.
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                System.out.print(intArr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    /*************************************************************
     *
     * Function: Main:areNumbersAscending(String numStr).
     * Purpose: Determines if the numbers in a string of numbers are sorted in ascending order.
     * Precondition: N/A.
     * Postcondition: N/A.
     *
     * @param numStr The string of numbers being tested.
     * @return True if the numbers are sorted in ascending order, false otherwise.
     *
     *************************************************************/
    public static boolean areNumbersAscending(String numStr) {
        for (int i = 1; i <= numStr.length() / 2; i++) {
            String baseStr = numStr;
            boolean flag = true;

            int numOne = Integer.parseInt(baseStr.substring(0, i));

            do {
                baseStr = baseStr.substring(i);
                int numTwo = Integer.parseInt(baseStr.substring(0, i));

                if (numOne + 1 != numTwo) {
                    flag = false;
                    break;
                } else {
                    numOne = numTwo;
                }

            } while (baseStr.length() > i);

            if (flag) {
                return true;
            }
        }

        return false;
    }

    /*************************************************************
     *
     * Function: Main:squarePatch(int num).
     * Purpose: Returns a 2-Dimensional int array containing copies of the number supplied..
     * Precondition: N/A.
     * Postcondition: N/A.
     *
     * @param num The size of both parts of the 2-Dimensional int array, as well as the value being stored.
     * @return The 2-Dimensional array of the num value.
     *
     *************************************************************/
    public static int[][] squarePatch(int num) {
        int[][] numArr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                numArr[i][j] = num;
            }
        }

        return numArr;
    }
}
