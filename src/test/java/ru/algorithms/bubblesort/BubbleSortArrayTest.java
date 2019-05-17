package ru.algorithms.bubblesort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author dshustrov
 * @version 1
 * @since 17.05.2019
 */
public class BubbleSortArrayTest {


    private int[] array;

    @Test
    public void whenArrayNotSortThenArraySort() throws MyException {
        int[] array = {5, 1, 2, 7, 3, 0, -87, -1};
        int[] resultArray = BubbleSortArray.sort(array);
        int[] expectArray =  {-87, -1, 0, 1, 2, 3, 5, 7};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenSortArrayTheyThrowMyException() {

        try {
            BubbleSortArray.sort(array);
            Assert.fail();
        } catch (MyException me) {
             Assert.assertEquals("Array must be initialized!", me.getMessage());
        }
    }
}
