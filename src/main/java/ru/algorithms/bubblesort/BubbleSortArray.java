package ru.algorithms.bubblesort;

/**
 * Class BubbleSortArray.
 *
 * @author dshustrov
 * @version 1
 * @since 17.05.2019
 */
public class BubbleSortArray {

    /**
     * Method sorts an array of integers ascending.
     *
     * @param sourceArray array of integers.
     * @return sort array of integers.
     */
    public static int[] sort(int[] sourceArray) throws MyException {

        if (sourceArray == null) {
            throw new MyException("Array must be initialized!");
        }
        for (int i = 0; i < sourceArray.length; i++) {
            for (int j = i + 1; j < sourceArray.length; j++) {
                if (sourceArray[i] > sourceArray[j]) {
                    int temp = sourceArray[i];
                    sourceArray[i] = sourceArray[j];
                    sourceArray[j] = temp;
                }
            }
        }
        return sourceArray;
    }
}
