package ru.algorithms.bubblesort;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author dshustrov
 * @version 1
 * @since 17.05.2019
 */
public class BubbleSortArrayTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private int[] array;

    @Test
    public void whenArrayNotSortThenArraySort() throws MyException {
        int[] array = {5, 1, 2, 7, 3, 0, -87, -1};
        int[] resultArray = BubbleSortArray.sort(array);
        int[] expectArray = {-87, -1, 0, 1, 2, 3, 5, 7};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenSortArrayTheyThrowMyException() throws MyException {
        thrown.expect(MyException.class);
        thrown.expectMessage(equalTo("Array must be initialized!"));
        BubbleSortArray.sort(array);
    }
}
